/*
 * Declaring Multiple Variables: part 1
*/
public class Multiple1 {

	/*
	 * class level
	 * declare 3 variables in the same statement
	 * but only i3 is initialized with 1
	 * i1 and i2 takes the default value 0
	 */ 
	int i1, i2, i3 = 1;

	public static void main(String args[]) {
		Multiple1 multiple = new Multiple1();
		multiple.printVar();	
		multiple.paintFence();
	}

	/**
	 * OUTPUT:
	 * 		0 0 1
	 */
	void printVar() {	
		System.out.println(i1 + " " + i2 + " " + i3);
	}

	void paintFence() {
		/**
		 * method level
		 * declare 3 variables in the same statement 
		 * but only i3 is initialized
		 */
		int n1, n2, n3 = 0;

		/**
		 * COMPILE ERROR:
		 * 		variable n1 might not have been initialized
		 * 		variable n2 might not have been initialized
		 */
		System.out.println(n1 + " " + n2 + " " + n3);
	}
}
