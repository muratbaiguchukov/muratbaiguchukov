package com.company.task4;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentManagement implements Management {
    public ArrayList<String> students = new ArrayList<>();
    private HashMap<String, Integer> points = new HashMap<>();


    @Override
    void addNewGroup(Group group);


    @Override
    void addNewStudentAndPointByGroupNumber(int number);

    public void buyingTicketsByFlightNumber(int number) {



    @Override
    void removalOfStudentFromGroupByGroupNumberAndStudent();



    @Override
    void transferGroupToNextCourse();


    @Override
    void expulsionStudents();


}

}
