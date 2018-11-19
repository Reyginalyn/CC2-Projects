package guessthenumberr;
import java.util.Scanner;
public class GuessTheNumberr {

    public static void main(String[] args) {
        Scanner guess = new Scanner(System.in);
        //ask for number
        System.out.println("Enter Number:");
        int num = 11;
        System.out.println("Guess 0 - 1000");
        //defaul number
        int no = 0;
        
        while (no != num){
            System.out.println("Enter Number:");
            
            if (no > num){
                System.out.println("your number is high");
            }else if(no < num){
                System.out.println("your number is low");
            }else if (no == num){
                System.out.println("the number is correct");
            }if (num %2==0){
                System.out.println("even number");
            }else{System.out.println("Odd number");
            
        }
    }
    }
}