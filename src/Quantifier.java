import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifier {
        public static void main(String[] args) {
            String str = "b%#@abcdbbb9870 &;";
//            Pattern p = Pattern.compile("[b]+"); //pattern provided
//            Pattern p = Pattern.compile("[b]*");
            Pattern p = Pattern.compile("[b]?");
            int ctr = 0;
            Matcher m = p.matcher(str);            //target string provided
            while(m.find()){
                System.out.println(m.start() + "--------"+ m.end() + "------" + m.group());
                ctr++;
            }
            System.out.println("Number of counts = " + ctr);
        }
    }
