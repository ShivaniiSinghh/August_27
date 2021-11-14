import java.util.Scanner;
class Rectangle1 {
    int area, length, breadth;
    Rectangle1() {
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        breadth = sc.nextInt();
    }
    public void Area() {
        area = length * breadth;
        System.out.println(area);
    }
}
public class Rectangle {
    public static void main(String[] args) {
        Rectangle1 obj = new Rectangle1();
        obj.Area();
    }
}
