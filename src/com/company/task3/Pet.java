package com.company.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Pet {
    public static void main(String[] args) {
        ArrayList<String> pet = new ArrayList<>();
        pet.add("Cat");
        pet.add("Dog");
        pet.add("Parrot");
        System.out.println(pet);

        HashMap<String, ArrayList> myHashMap = new HashMap<String, ArrayList>();
        myHashMap.put("Cat", pet);
        myHashMap.put("Dog", pet);
        myHashMap.put("Parrot", pet);

        System.out.println(myHashMap);

        myHashMap.put("Horse", pet);
        myHashMap.put("Cow", pet);

        System.out.println(myHashMap);

        Set<String> keys = myHashMap.keySet();
        System.out.println("Ключи: " + keys);



    }
}
