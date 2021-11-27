interface test{
     void square();
}
class arithmetic implements test{
    public void square(){
        System.out.println("Definition");
    }
}
public class ToTestInt {
    public static void main(String[] args) {
        arithmetic obj = new arithmetic();
        obj.square();
    }
}
