/**
 * Four code blocks in following code
 */

package com.farm;

public class Bird { // 1. class definition
    public static void main(String[] args) {    // 2. method declaration
        { System.out.println("Feathers"); } // 3. An inner block
    }
    { System.out.println("Snowy"); }    // 4. instance initializer
}
