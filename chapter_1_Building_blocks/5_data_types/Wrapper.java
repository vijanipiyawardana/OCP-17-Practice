//--------------------- Wrapper classes
 
 public class Wrapper {
    public static void main(String[] args) {
       
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
