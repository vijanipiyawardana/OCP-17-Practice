/*
 * Declaring Multiple Variables: part 2
*/
public class Multiple2{


	public static void main(String args[]){

		// 1. can declare multiple variables of same type in the same statement
		String s1, s2;

		// 2. can declare and initialize multiple variables of same type in the same statement
		String s3 = "yes", s4 = "no";

		System.out.println(s3 + " " + s4); // yes no



		// 3. cannot declare multiple variables of different types in the same statement
		int num, String value; // DOES NOT COMPILE

		// 4. can declare two statements in single line separated with semicolon ;
		int num1; int num2;


		// 5. Legal declarations of variables

		boolean b1, b2;				// legal
		String str1 = "1", str2;	// legal
		double d1, double d2;		// not legal, DOES NOT COMPILE
		int i1; int i2;				// legal
		int i3; i4;					// not legal, DOES NOT COMPILE
		
		/**
		 * line 31 and 32 are same as follows;
		 * the statements are separated from semicolon ;
		 * last statement omits the type, which gives COMPILE ERROR
		 */
		int n1;
		int n2;
		int n3;
		n4;	

	}	
}
