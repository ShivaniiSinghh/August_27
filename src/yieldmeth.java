public class yieldmeth extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hello");
        }
            Thread.yield();

    }
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println("Hi");
        }

        yieldmeth obj = new yieldmeth();
        obj.start();

    }
}
