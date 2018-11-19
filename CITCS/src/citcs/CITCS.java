package citcs;
import java.util.Scanner;
public class CITCS {

    public static void main(String[] args) {
        Scanner sharp = new Scanner(System.in);
        System.out.println("Name: ");
        String name = sharp.nextLine();
        
        System.out.println("What is your course?"
                + "\n[1] IT"
                + "\n[2]CS");
        byte course = sharp.nextByte();
        byte major;
        
        if (course == 1){
            System.out.println("What is your major?"
                    + "\n[1] Security Network"
                    + "\n[2] Web Development"
                    + "\n[3] Entrepreneurship");
                major = sharp.nextByte();
                    if (major == 1){
                System.out.println("Hello"+name+"of BSIT major in"+"Security Network");
                    } else if (major == 2){
                        System.out.println("Hello"+name+"of BSIT major in"+"Web Development");
                    }else if (major == 3){
                    System.out.println("Hello"+ name+ "of BSIT major in" + "Entrepreneurship");   
                    }           
        } else{
            System.out.println("What is your major?"
                    + "\n[1] Mobile Development"
                    + "\n[2] Digital Arts"
                    + "\n[3] Data Analytics");
            major = sharp.nextByte();
            if (major == 1){
                System.out.println("Hello"+ name+ "of BSCS major in" + "mobile Development");
            }else if (major==2){
                System.out.println("Hello"+ name+ "of BSCS major in" + "Digital Arts");
            }else if (major == 3){
                System.out.println("Hello"+ name+ "of BSCS major in" + "Data Analytics");
            }
                
                
            
            
            
                
            
                        
            }
        
    }
    
}
