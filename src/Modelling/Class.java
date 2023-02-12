package Modelling;

import java.util.List;

public class Class {
    private String name;
    private String subject;
    private List<String>students;
    private Teacher teacherName;

    public Class(String name, String subject, List<String> students, Teacher teacherName) {
    this.name = name;
    this.subject = subject;
    this.students = students;
    this.teacherName = teacherName;
    }

}
