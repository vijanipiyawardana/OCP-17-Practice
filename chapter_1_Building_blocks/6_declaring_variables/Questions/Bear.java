
public class Bear {
    private Bear pandaBear;
    private void roar(Bear b) {
        System.out.println("Roar!");
        pandaBear = b;
    }
    public static void main(String[] args) {
        Bear brownBear = new Bear();
        Bear polarBear = new Bear();
        brownBear.roar(polarBear);
        polarBear = null;
        brownBear = null;   // object created at line 9 and 10 eligible to gc: reason 1
        System.gc();
    }
}
/*
 * Which statements about the following program are correct? (Choose all that
 * apply.)
 * 
 * A.The object created on line 9 is eligible for garbage collection after line
 * 13.
 * B.The object created on line 9 is eligible for garbage collection after line
 * 14.
 * C.The object created on line 10 is eligible for garbage collection after line
 * 12.
 * D.The object created on line 10 is eligible for garbage collection after line
 * 13.
 * E.Garbage collection is guaranteed to run.
 * F.Garbage collection might or might not run.
 * G.The code does not compile.
 * 
 * 
 * Answer: A, D, F
 * 
 * Explaination:
 *  Garbage collection is never guaranteed to run, making option F correct and option E
    incorrect. Next, the class compiles and runs without issue, so option G is incorrect. 
    The Bear object created on line 9 is accessible until line 13 via the brownBear reference 
    variable, which is option A. The Bear object created on line 10 is accessible via both the 
    polarBear reference and the brownBear.pandaBear reference. After line 12, the object is still 
    accessible via brownBear.pandaBear. After line 13, though, it is no longer accessible since
    brownBear is no longer accessible, which makes option D the final answer.
 * 
 */