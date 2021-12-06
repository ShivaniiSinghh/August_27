import java.util.Scanner;

public class ProgrammingLang {
    ProgrammingLang(String name){
        if(name == ""){
            System.out.println("I love programming languages");
        }
        else{
            System.out.println("I love "+name);
        }
    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String name = a.nextLine();
            ProgrammingLang obj = new ProgrammingLang(name);
    }
}
