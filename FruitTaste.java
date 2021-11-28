import java.util.Scanner;

class Fruit {
    String fruit_name;
    String fruit_taste;
    public void eat(String fruit_name, String fruit_taste) {
        System.out.println(fruit_name);
        System.out.println(fruit_taste);
    }
}
class Apple extends Fruit{
    public void eat(String fruit_name, String fruit_taste) {
        System.out.println(fruit_name);
        System.out.println(fruit_taste);
    }
}
class Orange extends Fruit{
    public void eat(String fruit_name, String fruit_taste) {
        System.out.println(fruit_name);
        System.out.println(fruit_taste);
    }
}
public class FruitTaste{
    public static void main(String[] args) {
       Fruit obj1 = new Apple();
        obj1.eat("Apple","Sweet");
        Fruit obj2 = new Orange();
        obj2.eat("Orange","Savoury");
    }
}

