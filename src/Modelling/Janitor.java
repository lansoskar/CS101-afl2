package Modelling;

public class Janitor extends SchoolFaculty{
    private int workingHours;
    public Janitor(String name, Double salary, boolean hasKeys, int workingHours) {
        super(name, salary, hasKeys);
        this.workingHours = workingHours;
    }
    public void mop(){
        System.out.println("mops the floor");
    }
}
