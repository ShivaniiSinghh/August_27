import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers {
        public static void main(String[] args) {
//            String str = "b%#@abcdbbb9870 &;";
//            Pattern p = Pattern.compile("[\\s]"); //pattern provided
//            Pattern p = Pattern.compile("[\\S]");
//            Pattern p = Pattern.compile("[\\d]");
//           Pattern p = Pattern.compile("[\\D]");
//            Pattern p = Pattern.compile("[\\w]");
//            Pattern p = Pattern.compile("[\\W]");
//            int ctr = 0;
//            Matcher m = p.matcher(str);            //target string provided
//            while(m.find()){
//                System.out.println(m.start() + "--------"+ m.end() + "------" + m.group());
//                ctr++;
//            }
//            System.out.println("Number of counts = " + ctr);
            String str = "neer";
            System.out.println(str.matches("[a-z]{4}"));
            //match hua to true, nhi hua to false
        }
}
