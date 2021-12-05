import java.util.Scanner;

class AgeException extends RuntimeException{
    AgeException(String msg){
        super(msg);
    }
}
public class AgeEntered {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = a.nextLine();
        System.out.println("Enter your Age: ");
        int age = a.nextInt();
        try{
            if(age>=18 && age<60){
                System.out.println("Valid Age");
            }
            else
                throw new AgeException("Invalid Age");
        }
        catch(AgeException e){
           e.printStackTrace();
        }
    }
}