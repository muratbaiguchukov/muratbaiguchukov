package com.company.task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Unique {
    public static void main(String[] args) {
        String[] str = {"1, 2, 3, 4, 4, 5"};
        ArrayList<String> arr = new ArrayList<>();
        String[] strs = arr.toArray(new String[arr.size()]);
        Set<String> hashSet = new HashSet<>();
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("3");
        hashSet.add("4");
        hashSet.add("4");
        hashSet.add("5");
        System.out.println(hashSet);
    }
}
