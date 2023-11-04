/*
Q11.
Given the following two class files, what is the maximum number of imports that can be
removed and have the code still compile?
    A. 0
    B. 1
    C. 2
    D. 3
    E. 4
    F. Does not compile

Answer: E
Explanation: 
    The first two imports can be removed because java.lang is automatically imported. The
    following two imports can be removed because Tank and Water are in the same package,
    making the correct option E. If Tank and Water were in different packages, exactly one of
    these two imports could be removed. In that case, the answer would be option D.
 * 
*/

package aquarium;

import java.lang.*;
import java.lang.System;
import aquarium.Water;
import aquarium.*;

public class Tank {
    public void print(Water water) {
        System.out.println(water); 
    } 
}
