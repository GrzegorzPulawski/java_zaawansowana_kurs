package kolekcje.zadanie3;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String nameSchool;
    private int numberOfSchool;
    private List<ClassOfSchool> classOfSchoolList = new ArrayList<>();

    public School(String nameSchool, int numberOfSchool ) {
        this.nameSchool = nameSchool;
        this.numberOfSchool = numberOfSchool;

    }

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    public int getNumberOfSchool() {
        return numberOfSchool;
    }

    public void setNumberOfSchool(int numberOfSchool) {
        this.numberOfSchool = numberOfSchool;
    }

    public List<ClassOfSchool> getClassOfSchoolList() {
        return classOfSchoolList;
    }

    public void setClassOfSchoolList(List<ClassOfSchool> classOfSchoolList) {
        this.classOfSchoolList = classOfSchoolList;
    }
}
