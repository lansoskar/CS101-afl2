package Modelling;

public class Teacher extends SchoolFaculty{
private String teachingSubject;
private int nrOfClasses;
    public Teacher(String name, Double salary, boolean hasKeys, String teachingSubject, int nrOfClasses) {
        super(name, salary, hasKeys);
        this.teachingSubject = teachingSubject;
        this.nrOfClasses = nrOfClasses;
    }
}
