package com.company;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Declaring all variables at the top
        Scanner keyboard = new Scanner(System.in);
        Institution anInstitution;
        Course aCourse;
        String courseAnswer="";
        String institutionAnswer="";
        boolean courseDone=false;
        boolean institutionDone=false;

        ArrayList <Institution> allInstitutions = new ArrayList<>();

        do{
        System.out.print("Enter name of institution: ");
        anInstitution = new Institution(keyboard.nextLine());

        System.out.println("Your institution is called:"+anInstitution.getName());

                do{

                        aCourse = new Course();
                        System.out.println("Enter course title:");
                        aCourse.setCourseName(keyboard.nextLine());

                        System.out.println("Enter course number:");
                        aCourse.setCourseNumber(keyboard.nextLine());

                        System.out.println("Enter room number");
                        aCourse.setRoomNumber(keyboard.nextLine());

                        System.out.println("Your course details: Course Name:"+aCourse.getCourseName()+" Room Number:"+aCourse.getRoomNumber()+" Course Number:"+aCourse.getCourseNumber());

                        anInstitution.addCourse(aCourse);

                        System.out.println("Do you want to enter details for another course?");
                        courseAnswer=keyboard.nextLine();

                        if(courseAnswer.equalsIgnoreCase("no")||courseAnswer.equalsIgnoreCase("n"))
                            courseDone = true;
                        //I am courseDone.

                        //Ternary operator
                        //Am I done? "I am done" IF TRUE, "I am not done" IF FALSE
                        System.out.println("You responded:"+(courseDone?"I am done":"I am not done"));
                }while(!courseDone);

                //Add institution to the arraylist of institutions
                allInstitutions.add(anInstitution);

            System.out.println("Do you want to enter another institution?");
            institutionAnswer = keyboard.nextLine();
            if(institutionAnswer.equalsIgnoreCase("no")|| institutionAnswer.equalsIgnoreCase("n")){
                institutionDone = true;
            }
        }while(!institutionDone);


        for (Institution eachInstitution:allInstitutions) {
            System.out.println("These are courses for "+eachInstitution.getName());
            for(Course eachCourse:eachInstitution.getTheCourses())
            {
                System.out.println(" These are the details of the course: Course Number:"+eachCourse.getCourseNumber()+" Title:"+eachCourse.getCourseName()+" Room:"+eachCourse.getRoomNumber());
            }
        }





    }
}
