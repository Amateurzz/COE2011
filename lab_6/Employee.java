import java.util.Scanner;

public class Employee {
    // Initializing variables
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Employee() {
        // Get user input
        Scanner scan = new Scanner(System.in);

        /**
         * Continue code here to ask for the first name, last name, age, and salary, IN THAT ORDER
         */System.out.println("Input the employee's first name:");
         firstName = scan.nextLine();
         System.out.println("Input the employee's second name:");
         lastName = scan.nextLine();
         
         System.out.println("Input the employee's age");
         age = scan.nextInt();
         System.out.println("Input the employee's salary");
         salary = scan.nextDouble();
         
         

    }

    public String toString() {
        // insert logic for toString method
    	return "Employee's information: "+firstName+" "+lastName+" "+age+" "+salary;
    }
}