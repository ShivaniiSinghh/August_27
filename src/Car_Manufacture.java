import java.util.Arrays;
public class Car_Manufacture
{
    String manufacturer;
    int price;
    Car_Manufacture(String manufacturer,int price) {
        this.manufacturer=manufacturer;
        this.price=price;
    }
    public void dislplay() {
        System.out.println(manufacturer);
        System.out.println(price);
    }
    public static void main(String[] args) {
        int price[]= {300000, 500000, 200000};
        Arrays.sort(price);
        Car_Manufacture obj=new Car_Manufacture("Mercedes Benz",price[0]);
        obj.dislplay();
        Car_Manufacture obj1=new Car_Manufacture("Ferrari",price[1]);
        obj1.dislplay();
        Car_Manufacture obj2=new Car_Manufacture("Lamborgini",price[2]);
        obj2.dislplay();

    }
}
