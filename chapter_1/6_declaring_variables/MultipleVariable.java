public class MultipleVariable{


	void paintFence(){

		//declare 3 variables in the same statement but only i3 is initialized
		int i1, i2, i3 = 0;
		//System.out.println(i1); // compile error: i1 not initialized
		//System.out.println(i2); // compile error: i2 not initialized
		System.out.println(i3);
	}

	public static void main(String args[]){

		// declare multiple variables in the same statement : of same type
		String s1, s2;

		// declare and initialize multiple variables in the same statement : of same type
		String s3 = "yes", s4 = "no";

		System.out.println(s3 + " " + s4); // yes no

		MultipleVariable mv = new MultipleVariable();
		mv.paintFence();

		// declare multiple variables in the same statement with different types
		//int num, String value; // DOES NOT COMPILE

		// two statements in single line separated with semicolon ;
		int num1; int num2;

		// few more scenarios

		String s1 = "1", s2;		
		// int no1; no2; // DOES NOT COMPILE
		// double d1, double d2; // DOES NOT COMPILE

		/*
		int n1;
		int n2;
		int n3;
		n4;	// DOES NOT COMPILE
		*/

	}	
}
