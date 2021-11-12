public class Calculator {
    public static void powerInt(int num1, int num2){
        System.out.println(Math.pow(num1,num2));
    }
    public static void powerDouble(double num1, int num2){
        System.out.println(Math.pow(num1,num2));
    }
    public static void main(String[] args) {
        Calculator obj= new Calculator();
        powerInt(2,3);
        powerDouble(2,4);
    }
}

