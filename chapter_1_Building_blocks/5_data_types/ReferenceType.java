public class ReferenceType{

	public static void main(String args[]){

		//-------------------- String 
		String greeting1 = new String("Ayubowan!"); // new String object. In heap.

		String greeting2 = "Ayubowan!"; // String literal. Goes to String pool.

		System.out.println(greeting2.equals(greeting1)); 	// prints true
		System.out.println(greeting2 == greeting1); 		// prints false
		System.out.println(greeting1.equals(greeting2)); 	// prints true
		System.out.println(greeting1 == greeting2);			// prints false

		String greeting3 = "Ayubowan!";

		System.out.println(greeting2.equals(greeting3)); 	// prints true
		System.out.println(greeting2 == greeting3);         // prints true


		// Methods in Reference types
		String reference = "hello";
		int len = reference.length();
		System.out.println(len); // prints 5

		// primitives do not have methods declared on them
		//int bad = len.length(); // DOES NOT COMPLILE


		// assign null to reference type
		String abc = null;

		// cannot assign null to a primitive
		// int num = null; // DOES NOT COMPILE

	}
}
