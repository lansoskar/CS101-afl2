package Inheritance1;

public class SmartPhone extends Computer{
public String owner;

    public SmartPhone(boolean isOn, int screenSize, String model, String owner) {
        super(isOn, screenSize, model);
        this.owner = owner;
    }

    public void whoOwnsThePhone(){
        System.out.println(this.owner + " owns this phone");
    }
}
