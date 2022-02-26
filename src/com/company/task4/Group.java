package com.company.task4;

import java.util.ArrayList;

public class Group {
    public String name;
    public int course;
    public int id;
    public ArrayList<String> students = new ArrayList<>();

    @Override
    public boolean equals(Object ob) {
        if(ob == null) return false;
        if(this == ob) return true;
        if(Group.class.equals(ob.getClass())) return false;
        Group second = (Group) ob;
        return name.equals(second.name) && students.equals(second.students);

    }

    public Group() {
    }

    public Group(String name, int course, int id, ArrayList<String> students) {
        this.name = name;
        this.course = course;
        this.id = id;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", id=" + id +
                ", students=" + students +
                '}';
    }
}

