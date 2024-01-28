/*
 * applying scope to classes
 * the rule for instance variables is easier: 
 *  they are available as soon as they are defined and 
 *  last for the entire lifetime of the object itself.
 * The rule for class, aka static, variables is even easier: 
 *  they go into scope when declared like the other variable types.
 *  they stay in scope for the entire life of the program.
*/
public class Mouse {
    final static int MAX_LENGTH = 5;    // class variable
    int length;                         // instance variable
    public void grow(int inches) {      // local variable: method parameter inches
        if (length < MAX_LENGTH) {
            int newSize = length + inches;  // local variable newSize
            length = newSize;
        }
    }
}
