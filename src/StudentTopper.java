import java.util.Scanner;

class Student{
    String name;
    double percentage;
}
class Test1{
    Scanner sc = new Scanner(System.in);
    String name1 = sc.nextLine();
    String name2 =sc.nextLine();
    String name3 = sc.nextLine();
    double percentage1 = sc.nextDouble();
    double percentage2 = sc.nextDouble();
    double percentage3 =sc.nextDouble();
    void StudentTopper(){
        {
            if(percentage1>percentage2) {
                if (percentage1 > percentage3) {
                    System.out.println(name1);
                    System.out.println(percentage1);
                } else {
                    System.out.println(name3);
                    System.out.println(percentage3);
                }
            }
            else{
                if(percentage2>percentage3){
                    System.out.println(name2);
                    System.out.println(percentage2);
                }
                else{
                    System.out.println(name3);
                    System.out.println(percentage3);
                }
            }
        }
    }
}
public class StudentTopper {
    public static void main(String[] args) {
        Test1 obj = new Test1();
        obj.StudentTopper();
    }
}

