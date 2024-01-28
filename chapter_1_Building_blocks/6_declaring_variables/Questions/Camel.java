public class Camel {
    { int hairs = 3_000_0; }
    long water, air = 2;    // 2
    boolean twoHumps = true;    // 1
    public void spit(float distance) {  // 1
        var path = "";      // 1
        { double teeth = 32 + distance++; }
        while(water > 0) {
            int age = twoHumps ? 1 : 2; // 1
            short i = -1;                   // 1
            for(i=0; i<10; i++) {
                var Private = 2;
            }
            // SCOPE
        }
    }
}
/*
 *  Assuming the following class compiles, how many variables defined in the class or method
    are in scope on the line marked on line 14?
        A. 2
        B. 3
        C. 4
        D. 5
        E. 6
        F. 7
        G. None of the above
    
    Answer: F

    Explaination:
    To solve this problem, you need to trace the braces {} and see when variables go in and
    out of scope. The variables on lines 2 and 7 are only in scope for a single line block. The 
    variable on line 12 is only in scope for the for loop. None of these are in scope on line 14. 
    By contrast, the three instance variables on lines 3 and 4 are available in all instance methods.
    Additionally, the variables on lines 6, 9, and 10 are available since the method and while
    loop are still in scope. This is a total of 7 variables, which is option F.

 */