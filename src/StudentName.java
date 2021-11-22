class student{
    String ss;
    String name;
    public student(String ss){
        name = ss;
    }
    public student() {
        name = "unknown";
    }
}
public class StudentName{
    public static void main(String[] args) {
        student obj = new student("Shivani");
        student ss1 = new student();
        System.out.println(obj.name);
        System.out.println(ss1.name);
    }
}