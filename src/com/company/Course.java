package com.company;

public class Course {
    private String courseNumber;
    private String courseName;
    private String roomNumber;

    public Course() {
    }

    public Course(String courseNumber, String courseName) {
        this.courseNumber = courseNumber;
        this.courseName = courseName;
    }

    public Course(String courseNumber, String courseName, String roomNumber)
    {
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.roomNumber = roomNumber;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
}
