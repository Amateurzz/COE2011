   
import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) {
      Scanner scan = new Scanner(System.in);
      int choice;
      String again = "y";
    	do {
      do{
    		System.out.println("Which service would you like to use?\r\n"
    	
       		+ "[1]: Basic week visualizer\r\n"
       		+ "[2]: Advanced week visualizer\r\n"
       		+ "[3]: Basic calculator\r\n"
       		+ "[4]: Employee repertoire\r\n");
    	choice = scan.nextInt();
    	if(choice<=4 && choice>=1) {
    		
    	
    	if(choice==1) {
    		BasicWeek n = new BasicWeek();
    		n.printDays();
    	}else if(choice==2){
    		AdvancedWeek d = new AdvancedWeek();
    		d.printDays();
    	}else if(choice==3) {
    		Calculator calc = new Calculator();
    	}else if(choice==4){
    		
    		Employee emp = new Employee();
    		System.out.println(emp.toString());    }
    	}else {
    		System.out.println("Please make sure you pick a number between 1 and 4");
    	}}while(choice>4 || choice<1);
      
      System.out.println("Would you like to perform another operation? (y/n)");
     
      again = scan.next();
      
    
    	}while(again.equals("y"));
    	
    		
    }
    	
    	
    }