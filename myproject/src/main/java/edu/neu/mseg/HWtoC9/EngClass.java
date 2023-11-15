package edu.neu.mseg.HWtoC9;

import java.util.ArrayList;

public class EngClass {
    ArrayList<Student> students;
    public EngClass(){
        students = new ArrayList<>();
    }
    public EngClass(ArrayList<Student> students){
        this.students =students;
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void deleteStudent(int id){
        for(Student student: students){
            if (student.studentID == id) {
                students.remove(student);
                return;
            }
        }
    }
    public void readStudents(){
        for(Student student:students){
            System.out.println(student);
        }
    }
}
