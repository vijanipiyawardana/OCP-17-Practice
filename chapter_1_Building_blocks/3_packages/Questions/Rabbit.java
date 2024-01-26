class Rabbit {}         // X
import java.util.*;     // Y
package animals;        // Z

/**
 * Q2
 * Which answer options represent the order in which the following statements can be assembled 
 * into a program that will compile successfully? (Choose all that apply.)
 * 
        A. X, Y, Z
        B. Y, Z, X
        C. Z, Y, X
        D. Y, X
        E. Z, X
        F. X, Z
        G. None of the above
 * 
 * Answers: C, D, E
 * Explanation:
 *     The package and import statements are both optional. If both are present, the
       order must be package, then import, and then class. Option A is incorrect because
       class is before package and import. Option B is incorrect because import is before
       package. Option F is incorrect because class is before package.
 * 
 * 
 */
