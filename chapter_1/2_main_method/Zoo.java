/*
 * Writing a main() method.
 * Main method: entry point into the program.
 * 
 * main() method signature:
 * 		public access modifier: full access from anywhere
 * 		static: can be called by the class name, Zoo.main(), without having an object
 * 		void: return type,
 * 			good practice to use void for methods that can change an object's state.
 * 			main() method changes the program state from started to finished.
 * 		String args[] : parameter list, an array of java.lang.String objects, three formats.
 * 		final: optional modifier for main method
 */
public class Zoo{

	public static void main(String args[]){
		System.out.println("Hello World 1");	
	}

	// public static void main(String[] args){
	// 	System.out.println("Hello World 2");	
	// }

	/**
	 * Can have any name for  the array, name args is common
	 */
	// public static void main(String options[]){
	// 	System.out.println("Hello World 3");	
	// }

	/**
	 * The charactors, ... are called varargs (variable argument list)
	 */
	// public static void main(String... friends){
	// 	System.out.println("Hello World 4");	
	// }

	/**
	 * With optional modifier: final
	 */
	// public final static void main(final String[] args) {
	// 	System.out.println("Hello world 5");
	// }

	/*
	 * Passing parameters into Java program
	 * prints values that were read in (arguments) when the JVM started.
	 * 
	 * java -cp build Zoo elephant rabbit
	 * output:
	 * elephant
	 * rabbit
	 */
	// public static void main(String args[]) {
	// 	System.out.println(args[0]);
	// 	System.out.println(args[1]);
	// }

	/* if you want spaces inside an argument?
	 * java -cp build Zoo "african elephant" rabbit
	 * output:
	 * african elephant
	 * rabbit
	 */
	// public static void main(String args[]) {
	// 	System.out.println(args[0]);
	// 	System.out.println(args[1]);
	// }

	/*
	 * if you don't pass enough arguments?
	 * 
	 * java -cp build Zoo elephant
	 * Output:
	 * elephant
	 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
	 */
	// public static void main(String args[]) {
	// 	System.out.println(args[0]);
	// 	System.out.println(args[1]);
	// }
}
