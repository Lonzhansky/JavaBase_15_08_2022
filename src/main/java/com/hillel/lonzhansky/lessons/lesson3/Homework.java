package com.hillel.lonzhansky.lessons.lesson3;

public class Homework {
    public static void main(String[] args) {
        
        double latitude = 34.5435454;
        String str = "Some place coords: " + latitude + '\u00B0';
        String str2 = "Some place coords: 40.234242 \\u00B0";

        System.out.println(str);
        System.out.println(str2);
        
        double distance = latitude + 20;
    }
}
