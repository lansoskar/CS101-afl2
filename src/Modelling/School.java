package Modelling;
import java.util.List;

public class School {
private List<SchoolFaculty> employees;
private List<Class>Classes;

public School( List<SchoolFaculty> employees, List<Class> Classes){
    this.employees = employees;
    this.Classes = Classes;
}

}
