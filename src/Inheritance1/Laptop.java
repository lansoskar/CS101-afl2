package Inheritance1;

public class Laptop extends Computer{
private int batteryLifeHours;
    public Laptop(boolean isOn, int screenSize, String model, int batteryLifeHours) { //constructor Inheritance1.Laptop
        super(isOn, screenSize, model);
        this.batteryLifeHours = batteryLifeHours;
    }

    public void showBatteryLife(){
        System.out.println(this.batteryLifeHours + " hours left");
    }

}
