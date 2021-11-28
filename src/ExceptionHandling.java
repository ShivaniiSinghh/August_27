public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int a = 100, b = 0, c;

            c = a / b;
            System.out.println(c);
        }
        catch(ArithmeticException obj){
            System.out.println(obj);
            obj.printStackTrace();
            System.out.println("Hello");
            System.out.println(obj.toString());
            System.out.println(obj.getMessage());
        }
    }
}
