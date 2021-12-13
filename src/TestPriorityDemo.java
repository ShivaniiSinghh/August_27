public class TestPriorityDemo extends Thread {
    public void run(){
        System.out.println("Child Thread Priority is : "+ Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        System.out.println("Main Thread Priority is : "+ Thread.currentThread().getPriority());
//        Thread.currentThread().setPriority(MAX_PRIORITY);
//        Thread.currentThread().setPriority(NORM_PRIORITY);
        Thread.currentThread().setPriority(MIN_PRIORITY);
        TestPriorityDemo obj = new TestPriorityDemo();
        obj.start();
    }
}
