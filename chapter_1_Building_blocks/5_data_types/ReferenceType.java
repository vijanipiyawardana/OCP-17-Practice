public class ReferenceType{

	public static void main(String args[]){

		//-------------------- String 
		String greeting1 = new String("Ayubowan!"); // String object. In heap.

		String greeting2 = "Ayubowan!"; // String literal. Goes to String pool.

		System.out.println(greeting2.equals(greeting1)); 	// prints true
		System.out.println(greeting2 == greeting1); 		// prints false
		System.out.println(greeting1.equals(greeting2)); 	// prints true
		System.out.println(greeting1 == greeting2);		// prints false

		String greeting3 = "Ayubowan!";

		System.out.println(greeting2.equals(greeting3)); 	// prints true
		System.out.println(greeting2 == greeting3);             // prints true


		// Methods in Reference types
		String reference = "hello";
		int len = reference.length();
		//int bad = len.length(); // DOES NOT COMPLILE
		System.out.println(len); // prints 5


		// assign null to refefence type
		String abc = null;
		// int num = null; // DOES NOT COMPILE


		//--------------------- Wrapper classes

		// Converts String into the Wrapper class
		Double apple = Double.valueOf("200.99");
		
		// Helper Methods to convert values 
		System.out.println(apple.byteValue());   // prints -56
		// no 200 in byte, so it wraps around to -56.
		System.out.println(apple.intValue());    // prints 200
		// the value is truncated into 200, all decimal digits are dropped.
		System.out.println(apple.doubleValue()); // prints 200.99
	}
}
