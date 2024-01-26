public class ClownFish {
    int gills = 0, double weight=2;
    { int fins = gills; }
    void print(int length = 3) {
        System.out.println(gills);
        System.out.println(weight);
        System.out.println(fins);
        System.out.println(length);
} }
/**
 * Which statements about the following class are correct? (Choose all that apply.)
 * 
 *  A. Line 2 generates a compiler error.
    B. Line 3 generates a compiler error.
    C. Line 4 generates a compiler error.
    D. Line 7 generates a compiler error.
    E. The code prints 0.
    F. The code prints 2.0.
    G. The code prints 2.
    H. The code prints 3.
 * 
 * Answer: A, C, D
 * 
 * Explaination:
 *      Line 2 does not compile as only one type should be specified, making option A correct. 
 *      Line 3 compiles without issue as it declares a local variable inside an instance initial-
        izer that is never used. 
        Line 4 does not compile because Java does not support setting default method parameter
        values, making option C correct. 
        Finally, line 7 does not compile because fins is in scope and accessible only inside 
        the instance initializer on line 3, making option D correct.
 */