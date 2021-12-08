class Shape1 {
    public void draw1() {
        System.out.println("Drawing Shape");
    }
    public void erase1() {
        System.out.println("Erasing Shape");
    }
}
class Circle extends Shape1 {
        public void draw1() {
            System.out.println("Drawing Circle");
        }
        public void erase1() {
            System.out.println("Erasing Circle");
        }
}
class Triangle extends Shape1 {
        public void draw1() {
            System.out.println("Drawing Triangle");
        }
        public void erase1() {
            System.out.println("Erasing Triangle");
        }
}
class Square extends Shape1 {
        public void draw1() {
            System.out.println("Drawing Square");
        }
        public void erase1() {
            System.out.println("Erasing Square");
        }
}
public class Shapes {
    public static void main(String[] args) {
        Shape1 obj = new Circle();
        obj.draw1();
        obj.erase1();
        Shape1 obj1 = new Triangle();
        obj1.draw1();
        obj1.erase1();
        Shape1 obj2 = new Square();
        obj2.draw1();
        obj2.erase1();
    }
}
