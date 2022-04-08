import java.io.*;
import java.util.Scanner;
public class ExpensesTracker{
	public static void main(String[] args) throws IOException {
		File file = new File("expenses.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter printFile = new PrintWriter(bw);
		Scanner scan = new Scanner(System.in);
		String repeat ="", show ="";
		
		do {
			System.out.println("Input your name: ");
			String name = scan.nextLine();
			System.out.println("What did you purchase?");
			String item = scan.nextLine();
			System.out.println("How much did you pay");
			double price = scan.nextDouble();
			scan.nextLine();
			do{System.out.println("Would you like to log another purchase? (y/n)");
			repeat = scan.nextLine();}while(!repeat.equals("y")&&!repeat.equals("n"));
			printFile.print(name + " purchased "+ item +" for "+ price + " US Dollars.\n");
		}while(repeat.equals("y"));
		printFile.close();
		System.out.println("Get off of ZoodMall!");
		System.out.println("Would you like to read a summary of your purchases?");
		show = scan.nextLine();
		
		if(show.equals("y")) {
			Scanner scanFile = new Scanner(file);
			while(scanFile.hasNext()) {
				String reader = scanFile.nextLine();
				System.out.println(reader);
				
			}
			
		}
	}
}