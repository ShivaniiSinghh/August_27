import java.util.InputMismatchException;
import java.util.Scanner;
class CustomException extends Exception{
}
public class NumberFormat {
    public static void main(String[] args) {
        String stu1 = null;
        String stu2 = null;
        int average;
        int avg=0;
        int[] marks = new int[3];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the names : ");
        try{
            stu1=s.nextLine();
            stu2=s.nextLine();
        }
        catch(NumberFormatException obj)
        {
            System.out.println("end of code..");
        }
        System.out.println("Enter the marks ;");
        for(int i=0 ; i<2 ; i++)
        {       for (int j=0; j<3;j++)
        {
            try{
                marks[j]=s.nextInt();
            }
            catch(InputMismatchException obj)
            {
                System.out.println("end of the code..");
            }
            avg+=marks[j];
            if(marks[j]<0 || marks[j]>100 )
            {
                try{
                    throw new CustomException();
                }
                catch (CustomException obj)
                {
                    System.out.println("end of the code..");

                }

            }
        }
            average=avg;
            avg=0;
            if(i==0)
            {
                System.out.println("Average of "+ stu1 +" ; "+ average/3);
            }
            else{
                System.out.println("Average of "+ stu2 +" ; "+ average/3);
            }
        }

    }
}