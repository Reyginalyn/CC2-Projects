package userpassword;
import java.util.Scanner;
        public class UserPassword {

    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      String Username;
      String Password;
      String s1;
      
        System.out.println("Input Username: ");
        Username = sc.nextLine();
        System.out.println("Input Password: ");
        Password = sc.nextLine();
        
        System.out.println("Input Password Again: ");
        s1 = sc.nextLine();
        if (s1.equals (Password)) {
            System.out.println("Correct Password: " + s1);
        }else{
            System.out.println("Invalid Password: " + s1);
        }
    }
    
}
