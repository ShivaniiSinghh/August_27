public class StringConcat {
    public static void main(String[] args) {
        System.out.println(conCat("mark","kate"));
    }
    public static String conCat(String s1,String s2){
        String tmp = s1+s2;
        if(s1.length()>0 && s2.length()>0){
            if(s1.charAt(s1.length()-1)==s2.charAt(0)){
                tmp =  s1+s2.substring(1);
            }
        }
        return tmp;
    }
}
