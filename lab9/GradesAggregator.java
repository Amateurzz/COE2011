import java.util.Scanner;
public class GradesAggregator {
	public static void main(String[] args) {
		int[] assignment= new int[5];
		int attendance,midterm;
		int j =1,total=0;
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<assignment.length;i++) {
		
			System.out.println("Input the grade of assignment "+j);
			assignment[i]=scan.nextInt();
			j++;
		}
		System.out.println("Input the number of attended labs");
		attendance = scan.nextInt();
		System.out.println("Input the midterm grade");
		midterm = scan.nextInt();
		
		for(int i=0;i<assignment.length;i++) {
			
			total += assignment[i];
			
			
		}
		double average = 0.3*(total/assignment.length);
		double attendances = (attendance*100*0.05)/7;
		double mid = midterm*0.3;
		System.out.println("Assignments (30%): "+average+"\n"+
				"Attendance (5%): "+attendances+"\n"+
				"Midterm (30%): "+mid);
	}

}
