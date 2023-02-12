package Interface1;

public class Pizza implements FastFood{

    public Pizza(){}; // constructor
    @Override
    public void eat() {
        System.out.println("you eat the pizza");
    }

    @Override
    public void saveForLater() {
        System.out.println("you save the pizza for later");
    }
}
