/*
 * Compiled successfully. 
 * Run output: false
*/
public class CodeMe {
  public static void main(String[] args) {
    boolean flag = false;
    if (false) // (1)
      flag = !flag;
    System.out.println(flag);
  }
}

/*
 * Compiled successfully. 
 * Run output: false
*/
// public class CodeMe {
//   public static void main(String[] args) {
//     boolean flag = false;
//     if (false)          // (1)
//       flag = !flag;
//     System.out.println(flag);
//   }
// }


/*
 * Compilation failed: CodeMe.java:14: error: unreachable statement
      flag = !flag;
*/
// public class CodeMe {
//   public static void main(String[] args) {
//     boolean flag = false;
//     while (false)          // (1)
//       flag = !flag;
//     System.out.println(flag);
//   }
// }


/*
 * Compilation failed: CodeMe.java:14: error: unreachable statement
      flag = !flag;
 */
// public class CodeMe {
//   public static void main(String[] args) {
//     boolean flag = false;
//     while (false) // (1)
//       flag = !flag;
//     System.out.println(flag);
//   }
// }

/**
 * Answer(s):
 * - 	The program will compile without errors. When run, it will print false.
 * -  If the keyword if at (1) is replaced with the keyword while, the program will fail to compile.
 * 
 * Explanation:
In both cases, the code in the if statement and the while loop is unreachable, 
so it can never be executed. In the case of the while loop, the compiler flags an error. 
The if statement is treated as a special case by the compiler to simulate conditional compilation, 
allowing code that should not be executed.
 */
