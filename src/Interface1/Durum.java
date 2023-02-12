package Interface1;

public class Durum implements FastFood{
    public Durum(){}; //constructor
    @Override
    public void eat() {
        System.out.println("you eat the durum");
    }

    @Override
    public void saveForLater() {
        System.out.println("you save the durum for later");
    }
}


