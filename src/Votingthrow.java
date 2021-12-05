import java.util.Scanner;
class CustomException1 extends RuntimeException{
    CustomException1(String msg){
        super(msg);
    }
}
public class Votingthrow {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = a.nextInt();
        try {
            if (age < 18) {
                throw new CustomException1("You can't vote");
            }
            else
                System.out.println("You can vote");
        }
        catch (CustomException1 e) {
            e.printStackTrace();
        }
        System.out.println("Voting in Process");
    }
}
