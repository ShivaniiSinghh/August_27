public class PallindromeArray {
    static void palindrome(int arr[], int n){
            int flag = 0;
            for (int i=0;i<= n/2 && n!=0;i++) {
                if (arr[i] != arr[n-i-1]){
                    flag=1;
                    break;
                }
            }
            if (flag==1)
                System.out.println("Not Palindrome");
            else
                System.out.println("Palindrome");
        }
        public static void main(String[] args) {
        int arr[] = { 1,3,6,5,3,2};
        int n = arr.length;
        palindrome(arr, n);
    }
}


