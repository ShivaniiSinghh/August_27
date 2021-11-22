class Outer {
    public void display() {
        System.out.println("Display Method");
    }

    public static class Inner {
        public void display(){
            System.out.println("Called Display");
    }
}
}
    public class Outer_Inner {
    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.Inner obj2 = new Outer.Inner();
        obj.display();
        obj2.display();
    }
}
