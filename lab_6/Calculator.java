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
         */
        
        	System.out.print("Input the first number: ");
        while(!scanCalc.hasNextInt()) {
        	System.out.print("You haven't input a digit,please input the first number: ");
        	scanCalc.nextLine();
        }
         num1 = scanCalc.nextInt();
        
         do {
         System.out.println("Input the operator");
         operator = scanCalc.next();
        }while(!operator.equals("+")&&!operator.equals("-")&&!operator.equals("*")&&!operator.equals("/"));
       
        System.out.print("Input the second number: ");
        while(!scanCalc.hasNextInt()) {
        	System.out.print("You haven't input a digit, please input the second number: ");
        	scanCalc.next();
        }
        num2 = scanCalc.nextInt();
         
         switch(operator) {
         case "+":
        	 System.out.println(add(num1,num2));
        	 break;
         case "-":
        	 System.out.println(subtract(num1,num2));
        	 break;
         case "*":
        	 System.out.println(multiply(num1,num2));
        	 break;
         case "/":
        	 System.out.println(divide(num1,num2));
        	 
         }
        

        
       
    }

    public String add(int a, int b) {
    	
    	return a + "+" + b + "=" + (a+b);
    	
    	

    }

    public String subtract(int a, int b) {
       
         return a + "-" + b + "=" + (a-b); 

    }

    public String multiply(int a, int b) {
       
         int result = num1*num2; 
         return a + "*" + b + "=" + result; 

    }

    public String divide(int a, int b) {
       
         
         if(a%b == 0) { 
         return a + "/" + b + "=" + (a/b) ; 
         } else { 
         double e = a/(double)b; 
         return a + "/" + b + "=" + e ;

    }
        
    }
}
