public class RunnableInt implements Runnable{
    public void run(){
        for(int i =0; i<10 ; i++)
        System.out.println("Thread");
    }

    public static void main(String[] args) {
        RunnableInt obj = new RunnableInt();
        Thread t = new Thread(obj);
        t.start();
    }
}
