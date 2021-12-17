import org.w3c.dom.ls.LSOutput;

/* anonymous nested class
1) abstract modifier 2) interface
if you don't know the behaviour, declare that method with abstract modifier
if a class is having abstract method then it is mandatory to create the class with abstract modifier
 */
abstract class Result// jo class isko inherit kregi usko abstract classs define kregi
{
    abstract public void calculateResult();//if we don't need def/behaviour of method, use abstract
}                                          //{} generate error, abstract can't have body
// class Second extends Result // represents is a relationship
//{
//    public void calculateResult() // if defining, remove abstract , if not defining, use abstract
//    {
//        System.out.println("welcome"); // if going default to public (Narrowing) error
//    }                                 // if going public to default (Widening) no error
//}
/* public class TestAnonymousclass {
    public static void main(String[] args) {
        Second obj = new Second();
        obj.calculateResult();
    }

}
*/
// same program using anonymous method
public class TestAnonymousclass {
    public static void main(String[] args) {
        //Result obj1 = new Result();//can't create object of abstract classses
        Result obj1 = new Result() { // parent class
            @Override
            public void calculateResult() {
                System.out.println("hello"); // all code: anonymous child class
            }
        };
        Result obj2 = new Result()
        {
            @Override
            public void calculateResult() {
                System.out.println("second object");
            }

        };
        }
        // created anonymous class implicitly and gave its reference to obj1
        /* object arr[]=new object[5]
        arr[0]=new string();
        arr[1]= new result();
         */
    }
}
// parent class can hold reference if child class
// after compilation, class will have dollar sign showing that testAnonymousclass had=s anonymous class
//which represents anonymous class

