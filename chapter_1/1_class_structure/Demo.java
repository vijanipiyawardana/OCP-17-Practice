/**
 * Classes and Source Files
 * 
 * file name: Demo.java
 * compiled successfully.
 */
public class Demo {
}

/**
  * class name should be same as file name, if class is public.
  * compile error: class Demo1 is public, should be declared in a file named Demo1.java
  */
public class Demo1 {
}

/**
 * cannot have 2 public classes in same file.
 * compile error: class Demo1 is public, should be declared in a file named Demo1.java
 */
public class Demo {
}
public class Demo1 {
}


/**
 * Should have only one public class in one file.
 * compiled successfully.
 */
public class Demo {
}
class Demo1 {
}

/**
 * can have a class with a different name from file name, if the class is not public.
 * compiled successfully.
 */
class Demo1 {
}