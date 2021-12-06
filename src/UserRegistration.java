import java.util.Scanner;

class InvalidCountryException extends RuntimeException{
    InvalidCountryException(String msg){
        super(msg);
    }
}
public class UserRegistration{
    Scanner a = new Scanner(System.in);
    void registerUser(String username, String userCountry) {

        try {
            if (userCountry != "India") {
                throw new InvalidCountryException("User Outside India cannot be registered");
            }
            else if (userCountry == "India") {
                System.out.println("User registered done successfully");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
    UserRegistration obj = new UserRegistration();
    obj.registerUser("Mickey","US");
    obj.registerUser("Mini","India");
    }
}
