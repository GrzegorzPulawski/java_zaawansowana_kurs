package kolekcje.zadanie3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClassOfSchool {
    private String nameClass;
    private Set<Student> studentList = new HashSet<>();

    public ClassOfSchool(String nameClass, Set<Student> studentList) {
        this.nameClass = nameClass;
        this.studentList = studentList;
    }
    public ClassOfSchool(){

    }


    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public Set<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(Set<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student){
        this.studentList.add(student);
    }
    public void removeStudent(Student student){
        this.studentList.remove(student);
    }
}
