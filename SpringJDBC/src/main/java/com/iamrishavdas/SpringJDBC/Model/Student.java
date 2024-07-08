package com.iamrishavdas.SpringJDBC.Model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {

    private int rollNo;
    private String name;
    private float marks;

    public void setRollNo(int rollNo){ this.rollNo = rollNo; }
    public void setName(String name){ this.name = name; }
    public void setMarks(float marks){ this.marks = marks; }

    public int getRollNo(){ return this.rollNo; }
    public String getName(){ return this.name; }
    public float getMarks(){ return this.marks; }

    public Student(){}

    public Student(int rollNo, String name, float marks){
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString(){
        return "{ Name: "+ this.name +", Roll: " + this.rollNo + ", Marks: " + this.marks + " }";
    }

}
