package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly a = new RWOnly();

//    a.RWOnly = "Puneeth"; not possible because it is private;
        a.setName("Puneeth");
        a.getName();
//        System.out.println(a.getName());
    }
}