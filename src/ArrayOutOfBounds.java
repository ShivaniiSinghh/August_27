import java.util.Scanner;
public class ArrayOutOfBounds {
    public static void main(String[] args) {
        int size;
        int index;
        Scanner s = new Scanner(System.in);
        size = s.nextInt();
        int[] arr = new int[size];
        for(int i = 0;i<size;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the index : ");
        index = s.nextInt();
        try{
            System.out.println(arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException | NumberFormatException obj)
        {
            System.out.println("End of program");
        }
    }
}