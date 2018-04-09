package com.company;

import java.util.ArrayList;

public class Institution {
    private String name;
    private ArrayList<Course> theCourses;

    //Default constructor
    public Institution()
    {
        theCourses = new ArrayList<>();
    }
    //Overloaded constructor
    public Institution(String name){
        this.name=name;
        theCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Course> getTheCourses() {
        return theCourses;
    }

    public void setTheCourses(ArrayList<Course> theCourses) {
        this.theCourses = theCourses;
    }

    public void addCourse(Course course)
    {
        theCourses.add(course);
    }
}
