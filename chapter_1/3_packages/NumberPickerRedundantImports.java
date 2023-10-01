/**
 * Redundant Imports.
 * 
 * Special package which is sutomatically imported:
 *      java.lang
 * 
 * Three of the imports are redundant in this code.
 */
import java.lang.System;    // <--- redundant, because java.lang is automatically imported.
import java.lang.*;         // <--- redundant, because java.lang is automatically imported.
import java.util.Random;
import java.util.*;         // <--- redundant, because this would cover importing Random. Random is already imported in previous line.
public class NumberPickerRedundantImports {

    public static void main(String args[]) {
        Random r = new Random(); 
        System.out.println(r.nextInt(10)); // a number 0-9
    }
    
}
