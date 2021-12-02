//Regular Expressions
// can't write util.* because it calls classes not a subpackage which is regex
// local varibales ko jdk initialize nhi krta
//return type of group() method is String

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REdemo {
    public static void main(String[] args) {
//        String str = "the quick jdbc brown fox jumps jdbc";
//        Pattern p = Pattern.compile("jdbc");   //pattern provided
        String str = "the quick9999999jdbc abc@gmail.com brown78787878 fox ju345623mps jdbc";
//        Pattern p = Pattern.compile("[0-9]{6}");
        Pattern p = Pattern.compile("[0-9A-Za-z._]+@gmail.com");
        int ctr = 0;
        Matcher m = p.matcher(str);            //target string provided
        while(m.find()){
            System.out.println(m.start() + "--------"+ m.end() + "------" + m.group()); //start end(): gives index starting and ending
            //group(): jo string target string mein match hui h usko fetch krke dikhata h , pattern nhi print krra h
            ctr++;
        }
        System.out.println("Number of counts = " + ctr);
        //jahan jdbc aaya hai aur jitni baar aaya h , batana h
        //Pattern p1 = Pattern.compile("",Pattern.CASE_INSENSITIVE);
        //pre defined integer constant
    }
}
