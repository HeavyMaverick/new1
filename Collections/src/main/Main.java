package main;

import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= 10; i++){
            nums.add(i);
        }
        ArrayList<String> names = new ArrayList<>();
        names.add("Maxim");
        names.add("Eugene");
        names.add("John");
        names.add("Alexey");
        names.add("Olga");
        names.add("Natalya");
        names.add("Jason");
        names.add("Yuriy");
        names.add("Oleg");
        names.add("Daniil");
        ArrayList<String> students = new ArrayList<>();
        String s;
        for (int i = 0, j = 0; i < nums.size(); i++){
            students.add(nums.get(i) + " - " + names.get(j));
            j++;
        }
        for (String student : students){
            System.out.println(student);
        }
    }
}
