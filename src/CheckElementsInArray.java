import java.util.Arrays;
import java.util.stream.IntStream;

public class CheckElementsInArray{
    private static void check(int[] arr, int toCheckValue)
    {
        boolean test = false;
        for (int element : arr){
            if (element == toCheckValue){
                test = true;
                break;
            }
        }
        System.out.println(toCheckValue);
        System.out.println(test);
    }
    public static void main(String[] args)
    {
        int arr[] = {1,5,3,6,4,8,3};
        int toCheckValue =2;
        System.out.println("Array: "
                + Arrays.toString(arr));
        check(arr, toCheckValue);
    }
}
