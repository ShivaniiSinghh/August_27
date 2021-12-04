import java.sql.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudentDetailsJDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");                                                                             // oracle.jdbc.oracledriver
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/E2 Data","root","");
        PreparedStatement ps = con.prepareStatement("insert into info values (?,?)");                         // used to insert values that full-fill the  condition

        Scanner sc = new Scanner(System.in);                                             // creating the object of string class
        System.out.println("Enter the String:");                                         // a msg to  enter the string
        String str = sc.nextLine();                                                      // for entering the string

        Pattern ph_no = Pattern.compile("(0|91)?[9 6][0-9]{9}");                                 // format of phone no
        Pattern email = Pattern.compile("[a-zA-Z0-9._]+@(gmail|yahoo|redditmail)+.com");        // format of e-mail

        Matcher m = email.matcher(str);                                                 // check the match of email in the string
        Matcher n = ph_no.matcher(str);                                                  // check the match of phone no in the string
        //  int c=0,ctr=0;                                                                // no need just ....
        String s1 = null ,s2 = null;                                                    // initialises two string with null value
        try {                                                                           // try block for the exception
            while(m.find()) {
                s1 = m.group();
                //   c++;
            }
            while(n.find()) {
                s2 = n.group();
                //    ctr++;
            }
            if (s1.equals(null)||s2.equals(null)) {
                throw new Exception("Invalid Data");
            }
            else {
                ps.setString(1,s1);
                ps.setString(2,s2);
                ps.executeUpdate();
            }
        }
        catch (Exception e) {
            //    e.printStackTrace();
            System.out.println(e);
        }
        con.close();
    }
}