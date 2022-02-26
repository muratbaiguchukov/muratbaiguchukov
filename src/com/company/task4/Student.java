package com.company.task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {
    public Long pin;
    public String fulName;
    public HashMap<String, Integer> points = new HashMap<>();

    public Student() {
    }

    public Student(Long pin, String fulName, HashMap<String, Integer> points) {
        this.pin = pin;
        this.fulName = fulName;
        this.points = points;
    }

    public Long getPin() {
        return pin;
    }

    public void setPin(Long pin) {
        this.pin = pin;
    }

    public String getFulName() {
        return fulName;
    }

    public void setFulName(String fulName) {
        this.fulName = fulName;
    }

    public HashMap<String, Integer> getPoints() {
        return points;
    }

    public void setPoints(HashMap<String, Integer> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Student{" +
                "pin=" + pin +
                ", fulName='" + fulName + '\'' +
                ", points=" + points +
                '}';
    }

    @Override
    public boolean equals(Object ob) {
        if(ob == null) return false;
        if(this == ob) return true;
        if(!Student.class.equals(ob.getClass())) return false;
        Student second = (Student) ob;
        return fulName.equals(second.fulName) && points.equals(second.points);




    }
}
