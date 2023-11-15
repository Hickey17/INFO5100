package edu.neu.mseg.HWtoC9;

public class Student {
    int studentID;
    String firstName;
    String lastName;
    public Student(){
        studentID = -1;
        firstName = "default first name";
        lastName = "default last name";
    }
    public Student(int studentID,String firstName,String lastName){
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "ID: "+studentID+", first name: "+firstName+", last name: " + lastName;
    }
    
}
