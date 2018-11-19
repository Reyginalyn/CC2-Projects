package calculator;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
      Scanner guess = new Scanner (System.in);
      int num1;
      int num2;
      String Operator;
        System.out.println("Imput First Number: ");
        num1 = guess.nextInt();
        
        System.out.println("Imput Second Number: ");
        num2 = guess.nextInt();
        
        System.out.println("Select Arithmetic Operator: ");
        Operator = guess.next();
        
        if (Operator.equals("+")) {
        } else if (Operator.equals("-")){
            System.out.println("Your answer is: " + (num1 - num2));
        }
        else if (Operator.equals ("*")){
            System.out.println("Your answer is: " +(num1 * num2));
        }else if (Operator.equals("/")){
            System.out.println("Your answer is: " + (num1 / num2));
            
            
        }
        else {
            System.out.println("Your answer is: " + (num1 + num2));
        }
        
    }
   
}
