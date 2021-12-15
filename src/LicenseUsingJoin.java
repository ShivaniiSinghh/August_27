class Medical extends Thread{
    public void run(){
        try{
            System.out.println("Medical Work Starts");
            Thread.sleep(3000);
            System.out.println("Medical Work Completed");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class TestDrive extends Thread{
    public void run(){
        try{
            System.out.println("Test Drive Starts");
            Thread.sleep(3000);
            System.out.println("Test Drive Completed");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class OfficerWork extends Thread{
    public void run(){
        try{
            System.out.println("Official Work Starts");
            Thread.sleep(3000);
            System.out.println("Official Work Completed");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
public class LicenseUsingJoin {
    public static void main(String[] args) throws InterruptedException {
        Medical m = new Medical();
        m.start();
        m.join();
        TestDrive t = new TestDrive();
        t.start();
        t.join();
        OfficerWork o = new OfficerWork();
        o.start();
    }
}
