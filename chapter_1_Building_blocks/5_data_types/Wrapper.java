//--------------------- Wrapper classes
 
 public class Wrapper {
    public static void main(String[] args) {

        System.out.println(Boolean.valueOf(true));  // true
        System.out.println(Character.valueOf('c')); // c
       
        // Converts String into int primitive
        int primitive = Integer.parseInt("123");    
        System.out.println(primitive);              // 123

		// Converts String into the Wrapper class: a variant of valueOf() method
        Integer wrapper = Integer.valueOf("123");
        System.out.println(wrapper);                // 123
		Double apple = Double.valueOf("200.99");
        System.out.println(apple);                  // 200.99
		

        /**
         * Helper Methods to convert values 
         * 
         * All numeric classes extend the Number class, which has helper methods:
         * byteValue(), shortValue(), intValue(), longValue(), floatValue() and doubleValue()
         * 
         * Boolean and Character wrapper classes include booleanValue() and charValue() respectively
         * 
         */
	
		System.out.println(apple.byteValue());   // prints -56
		// there is no 200 in byte, so it wraps around to -56.

		System.out.println(apple.intValue());    // prints 200
		// the value is truncated into 200, all decimal digits are dropped.

		System.out.println(apple.doubleValue()); // prints 200.99


        // additional helper methods
        int num1 = 10;
        int num2 = 11;
        System.out.println(Integer.max(num1, num2));    // 11
        System.out.println(Integer.min(num1, num2));    // 10
        System.out.println(Integer.sum(num1, num2));    // 21
    }
    
}
