import java.util.Scanner;

public class BoxVolume {
    double w, b, d;

    BoxVolume(int width, int breadth, int depth) {
        w = width;
        b = breadth;
        d = depth;
    }
    double volume(){
        double v;
        v= w*b*d;
        return v;
    }
    public static void main(String[] args) {
      BoxVolume obj = new BoxVolume(3,5,8);
        System.out.println(obj.volume());
    }
}
