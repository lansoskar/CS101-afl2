package Modelling;/*
School faculty extender basic funktionalitet til staff
 */

public abstract class SchoolFaculty {
    private String name;
    private Double salary;
    private boolean hasKeys;
    public SchoolFaculty(String name, Double salary, boolean hasKeys){
        this.name = name;
        this.salary = salary;
        this.hasKeys = hasKeys;
    }
}
