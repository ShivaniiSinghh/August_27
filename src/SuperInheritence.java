class First{
    public First{
        super();
        System.out.println("First constructor");
    }
}
class Second extends First{
    Second()//if parameterised constructor, don't use super
            // if non-para constructor, use super
    { super();
        System.out.println("Second Constructor"); //multilevel inheritence
    }
}
class Third extends Second{
    Third()
    { super();// refers immediately to parent class
        System.out.println("Third Constructor");
    }
}
public class SuperInheritence{
    public static void main(String[] args) {
      Third obj = new Third();
    }
}




class First{
    public First(int a){
        System.out.println("First constructor"+ a);
    }
}
class Second extends First{
    Second(int b, int c, int d)//if parameterised constructor, don't use super
    // if non-para constructor, use super
    { super(b);
        System.out.println("Second Constructor" + b + " "+c); //multilevel inheritence
    }
}
class Third extends Second{
    Third(int p,int q, int r, int s)
    { super(p, q, r, s);// refers immediately to parent class
        System.out.println("Third Constructor"+p+q+r+s);
    }
}
public class SuperInheritence{
    public static void main(String[] args) {
        Third obj = new Third(12,23,45,67);
    }
}

