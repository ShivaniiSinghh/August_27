import java.util.Scanner;
public class Patient {
    Scanner s = new Scanner(System.in);
    String patientName= s.nextLine();
    double height = s.nextDouble();
    double weight = s.nextDouble();
    double BMI=(weight/(height*height));

    public static void main(String[] args) {
        Patient obj = new Patient();
        System.out.println(obj.BMI);
    }
}
