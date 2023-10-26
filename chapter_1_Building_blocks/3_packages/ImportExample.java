package com.vijani;

// import a pre-defined, user defined or third party defined package
import java.util.Random;

public class ImportExample {
    public static void main(String args[]){
        Random r = new Random();
        // gives a value between 0 and 1, and multiply by 10.
        System.out.println(r.nextInt(10));
    }
}
