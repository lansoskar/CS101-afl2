package Interface1;

public class Sandwich implements FastFood{

    public Sandwich(){}; //constructor
    @Override
    public void eat() {
        System.out.println("you eat the sandwich");
    }

    @Override
    public void saveForLater() {
        System.out.println("you save the sandwich for later");
    }
}
