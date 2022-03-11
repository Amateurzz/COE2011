package lab6;
import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;

    // Constructor to initialize the calculator
    public Calculator() {
        // Get user input
        Scanner scanCalc = new Scanner(System.in);
        /**
         * Continue code here to ask for the first number, the operator, and the second number, IN THAT ORDER
         */System.out.print("Input the first number: ");
         this.num1 = scanCalc.nextInt();

         System.out.println("Input the operator");
         this.operator = scanCalc.next();

         System.out.print("Input the second number: ");
         this.num2 = scanCalc.nextInt();
         
         switch(this.operator) {
         case "+":
        	 System.out.println(add(num1,num2));
        	 break;
         case "-":
        	 subtract(num1,num2);
        	 break;
         case "*":
        	 multiply(num1,num2);
        	 break;
         case "/":
        	 divide(num1,num2);
        	 
         }
        

        // Decide on the operation to perform 
        /**
         * Insert code to decide on which function to call, based on the operator the user chose
         * Hint: Switch statement
         */
    }

    public String add(int a, int b) {
    	
    	return a + "+" + b + "=" + (a+b);
    	
    	

    }

    public String subtract(int a, int b) {
        /**
         * Enter logic
         */
         return a + "-" + b + "=" + (a-b); 

    }

    public String multiply(int a, int b) {
        /**
         * Enter logic
         */
         int result = num1*num2; 
         return a + "*" + b + "=" + result; 

    }

    public String divide(int a, int b) {
        /**
         * Enter logic
         */
         if(a%b == 0) { 
         return a + "/" + b + "=" + (a/b) ; 
         } else { 
         double e = a/(double)b; 
         return a + "/" + b + "=" + e ;

    }
        
    }
}
