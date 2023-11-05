package com.farm;

public class Chick {

    private String name = "Fluffy"; // 1. field

    { System.out.println("setting field"); } // 2. instance initializer block

    public Chick() {    // 3. constructor
        name = "Tiny";
        System.out.println("setting constructor");
    }

    public static void main(String[] args) {    // 4. main method
        Chick chick = new Chick();
        System.out.println(chick.name);
    }
}
