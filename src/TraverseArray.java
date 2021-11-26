public class TraverseArray {
    public static void main(String[] args) {
        // for 1-D Array
        int[] a = {10,20,30};
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("\n");
        //for 2-D Array
        int[][] a1 = {{10,20,30},{40,50,60}};
        for(int i=0; i<a1.length; i++){
            for(int j=0; j< a1[i].length; j++){
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
