/*
 * The import statement imports only classes directly under the package.
 * Not included in import Statements:
 *      Child packages
 *      fields
 *      methods
 * if you want to use class AtomicInteger in the java.util.concurrent.atomic package
*/

import java.util.*; // WRONG
import java.util.concurrent.*; // WRONG
import java.util.concurrent.atomic.*; // CORRECT USE OF IMPORT TO USE AtomicInteger class

public class AtomicIntegerDemo {
    public static void main(String args[]) {

        // Create an AtomicInteger with an initial value of 0
        AtomicInteger ai = new AtomicInteger(0);

        // Prints the value
        System.out.println(ai.get());

        // Increment the AtomicInteger atomically
        int incrementedValue = ai.incrementAndGet();
        System.out.println("Incremented Value: " + incrementedValue);

        // Decrement the AtomicInteger atomically
        int decrementedValue = ai.decrementAndGet();
        System.out.println("Decremented Value: " + decrementedValue);

        // Add a specific value atomically
        ai.addAndGet(5);
        System.out.println("After Adding 5: " + ai.get());

        // Compare and set (if the current value is 3, set it to 10)
        boolean updated = ai.compareAndSet(3, 10);
        System.out.println("Compare and Set Result: " + updated);
        System.out.println("After Compare and Set: " + ai.get());

    }
}
