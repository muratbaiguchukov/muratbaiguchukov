package com.company.task4;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        Group gr = new Group();
        gr.name = "JV-F21";
        gr.course = 1;
        gr.id = 1;
        gr.students = new ArrayList<>();

        Group gr1 = new Group();
        gr1.name = "FALL-21";
        gr1.course = 1;
        gr1.id = 1;
        gr1.students = new ArrayList<>();

        boolean isEqual = gr == gr1;
        System.out.println(isEqual);

        Student st = new Student();
        st.pin = 22002199500045L;
        st.fulName = "Иванов Иван Иванович";
        st.points ={"Maths",  5, "English", 3};

        Student st1 = new Student();
        st1.pin = 21002199500545L;
        st1.fulName = "Петров Петр Петрович";
        st1.points ={"Maths", 4, "English", 3};

        boolean isEqual = st == st1;
        System.out.println(isEqual);

        System.out.println(gr.hashCode());
        System.out.println(gr1.hashCode());
        System.out.println(st.hashCode());
        System.out.println(st1.hashCode());


    }
}
