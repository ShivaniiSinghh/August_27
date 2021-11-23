import java.util.Scanner;
public class NonNegativeTens {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=(n/10);
        int a=(k%10);
        System.out.println(a);
    }
}

