interface LibraryUser{
    public void name();
    public void registerAccount(int age);
    public void requestBook(String booktype);
}
class KidUsers implements LibraryUser {
    int age;
    String booktype;

    @Override
    public void name() {
        System.out.println("Name");
    }
    @Override
    public void registerAccount(int age) {
        if (age < 12) {
            System.out.println("You have successfully Registered under Kids Account");
        }
        else{
            System.out.println("Sorry, age must be less than 12 to register as a kid");
        }
    }
    @Override
    public void requestBook(String booktype){
        if (booktype.equals("Kids")) {
            System.out.println("Book issued successfully, please return the book within 10 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}
class AdultUser implements LibraryUser{
    int age;
    String booktype;

    @Override
    public void name() {
        System.out.println("Name");
    }
    @Override
    public void registerAccount(int age) {
        if (age > 12) {
            System.out.println("You have successfully Registered under Adult Account");
        }
        else{
            System.out.println("Sorry, age must be greater than 12 to register as a Adult");
        }
    }
    @Override
    public void requestBook(String booktype){
        if (booktype.equals("Fiction")) {
            System.out.println("Book issued successfully, please return the book within 7 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only adult fiction books");
        }
    }
}
public class LibraryUserInterface {
    public static void main(String[] args) {
        LibraryUser obj = new KidUsers();
        LibraryUser obj1 = new AdultUser();
        obj.registerAccount(12);
        obj1.requestBook("Kids");
    }
}
