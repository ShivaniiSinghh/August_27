class AddAmount{
    int amount = 50;
    AddAmount(){
    }
    AddAmount(int a){
        amount = a + amount;
    }
    public void displayamount(){
        System.out.println("Amount is : "+ amount);
    }
}
public class PiggieBank {
    public static void main(String[] args) {
        AddAmount obj = new AddAmount();
        AddAmount obj1 = new AddAmount(50);
        obj.displayamount();
        obj1.displayamount();
    }
}
