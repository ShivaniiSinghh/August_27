public class ThreadPriority extends Thread{
    public void run(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        ThreadPriority obj = new ThreadPriority();
//        System.out.println(Thread.currentThread().getName());
//        Thread.currentThread().setName("Shivani");
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getPriority());
//        Thread.currentThread().setPriority(MAX_PRIORITY);
        Thread.currentThread().setPriority(MIN_PRIORITY);
//        Thread.currentThread().setPriority(NORM_PRIORITY);
        System.out.println(Thread.currentThread().getPriority());
        obj.start();
    }
}
