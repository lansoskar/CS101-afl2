package Modelling;

public class Headmaster extends SchoolFaculty{
    private String carModel;
    public Headmaster(String name, Double salary, boolean hasKeys, String carModel) {
        super(name, salary, hasKeys);
        this.carModel = carModel;
    }
    public void drive(){
        System.out.println("the headmaster drives around in his " + this.carModel);
    }
}
