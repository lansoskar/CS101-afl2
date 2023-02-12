package Inheritance1;

public abstract class Computer {
    private boolean isOn;
    private int screenSize;
    private String model;

    public Computer(boolean isOn, int screenSize, String model) { //constructor
        this.isOn = isOn;
        this.screenSize = screenSize;
        this.model = model;
    }

    public void toggleOn(){
    this.isOn = !this.isOn;
    }

    public void showModel(){
        System.out.println(this.model);
    }
}




