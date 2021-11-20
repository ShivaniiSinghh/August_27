abstract class Instruments1{
    abstract void play();
}
class Piano extends Instruments1{
    void play(){
        System.out.println("Piano is playing tan tan tan");
    }
}
class Flute extends Instruments1{
    void play(){
        System.out.println("Flute is playing toot toot toot");
    }
}
class Guitar extends Instruments1{
    void play(){
        System.out.println("Guitar is playing tin tin tin");
    }
}
public class Instruments {
    public static void main(String[] args) {
        Instruments1 obj = new Piano();
        Instruments1 obj1 = new Flute();
        Instruments1 obj2 = new Guitar();
        Instruments arr[]=new Instruments[10];
        int min=1;
        int max=10;
        int range = max - min + 1;
        for(int i=0 ; i<10 ; i++){
            int r = (int)((Math.random()*range)+min);
            switch(r){
                case 1 :
                    obj.play();
                    System.out.println("At Index"+ i);
                    break;
                case 2 :
                    obj1.play();
                    System.out.println("At Index"+ i);
                    break;
                case 3 :
                    obj2.play();
                    System.out.println("At Index"+ i);
                    break;

            }
        }
    }
}

