package edu.neu.mseg.HWtoC9;

import java.util.ArrayList;

public class HWtoC9 {
    public static void main(String[] args) {
        Student student1 = new Student(1,"xiaomei","zhang");
        Student student2 = new Student(2,"ping","wang");
        Student student3 = new Student(3,"si","li");
        
        EngClass javaClass = new EngClass();
        javaClass.addStudent(student1);
        javaClass.addStudent(student2);
        javaClass.addStudent(student3);
        
        System.out.println("original java class student list: ");
        javaClass.readStudents();

        System.out.println("new student list: ");
        javaClass.deleteStudent(3);
        javaClass.readStudents();

    }
}
