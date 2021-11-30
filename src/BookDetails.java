import java.util.*;
class Author {
        String name="";
        String email="";
        char gender;
        Author(String nm,String mail,char g) {
        name=nm;
        email=mail;
        gender=g;
        }
}
class Book {
    String bookname;
    Author auth;
    double price;
    int qtyInStock;
    Book(String bname, Author author) {
        bookname=bname;
        auth=author;
    }
    void setPrice(double pr) {
        price=pr;
    }
    void setqtyInStock(int n) {
        qtyInStock = n;
    }
    double getPrice() {
        return price;
    }
    int getqtyInStock() {
        return qtyInStock;
    }
    String getName() {
        return bookname;
    }
    Author getAuthor() {
        return auth;
    }
}
public class BookDetails{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String vals[]=input.split(" ",6);
        Author aob=new Author(vals[0],vals[1],vals[2].charAt(0));
        Book bob=new Book(vals[3],aob);
        double price=Double.parseDouble(vals[4]);

        int qty=Integer.parseInt(vals[5]);
        bob.setPrice(price);
        bob.setqtyInStock(qty);
        Author aob1=bob.getAuthor();
        System.out.println(bob.getName()+"\t"+bob.getPrice()+"\t"+bob.getqtyInStock()+"\t"+aob1.name+"\t"+aob1.email+"\t"+aob1.gender);
    }
}
