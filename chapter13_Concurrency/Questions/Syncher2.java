/*
 * Output: 20
 * Answer:
 * - The program will compile. When run, it will print 20 and terminate normally.
 * Explanation:
 * The runner thread can only proceed if intArray[0] is not 0. If this element is not 0, 
 * it has been initialized to 10 by the main thread. If this element is 0, 
 * the runner thread is put into the wait set of the intArray object, 
 * and must wait for notification. The main thread only notifies after initializing 
 * both elements of the array to 10. Calling the notify() method on an object with 
 * no threads in its wait set does not pose any problems. A thread can only call notify() 
 * on an object whose lock it holds. Therefore, the last synchronized statement in the main() 
 * method is necessary.
*/
public class Syncher2 {
    static final int[] intArray = new int[2];

    private static void pause() {
        while (intArray[0] == 0) {
            try {
                intArray.wait();
            } catch (InterruptedException ie) {
                System.out.println(Thread.currentThread() + " interrupted.");
            }
        }
    }

    public static void main(String[] args) {
        Thread runner = new Thread() {
            public void run() {
                synchronized (intArray) {
                    pause();
                    System.out.println(intArray[0] + intArray[1]);
                }
            }
        };

        runner.start();
        intArray[0] = intArray[1] = 10;
        synchronized (intArray) {
            intArray.notify();
        }
    }
}
