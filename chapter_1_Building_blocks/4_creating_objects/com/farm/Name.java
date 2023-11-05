package com.farm;

public class Name {
    String first = "Theodore";  // write to field
    String last = "Moose";      // write to field
    String full = first + last; // read and write data

    public static void main(String[] args) {
        Name n = new Name();
        System.out.println(n.full);
    }
}
