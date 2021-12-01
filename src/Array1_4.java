import java. util. *;

public class Array1_4{
        public static void main(String args[]){
            Scanner sc = new Scanner ( System.in ) ;
            int i, k=0 ;
            int[] a = new int[5];
            System.out.println (" Enter the array elements ");
            for ( i=0;i<a.length;i++)
                a [i] = sc.nextInt();
        for ( i=0;i<a.length;i++) {
            if ( a [ i ] == 1 || a [ i ] == 4 )
                k++;
        }
        if ( k == a.length )
            System.out.println (" True ");
        else
            System.out.println (" False ");
        }

}

