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

	// public static void main(String args[]){
	// 	System.out.println("Hello World 1");	
	// }

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
	 * prints values that were read in (arguments) when the JVM started.
	 */
	public static void main(String args[]) {
		System.out.println(args[0]);
		System.out.println(args[1]);
	}
}
