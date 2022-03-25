package com.example.fee_management_new.Api;

public class FeeManagement {
    public Object courseName;
    public int id;
    public String section;
    public String std;
    public int studentsCount;

    public FeeManagement(Object courseName, int id, String section, String std, int studentsCount) {
        this.courseName = courseName;
        this.id = id;
        this.section = section;
        this.std = std;
        this.studentsCount = studentsCount;
    }

    public Object getCourseName() {
        return courseName;
    }

    public int getId() {
        return id;
    }

    public String getSection() {
        return section;
    }

    public String getStd() {
        return std;
    }

    public int getStudentsCount() {
        return studentsCount;
    }
}
