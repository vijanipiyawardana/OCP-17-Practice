/**
 * Classes and Source Files
 * 
 * Top-level type: a data structure that can be defined independently within a source file, here is a class.
 * Top-level class is often public.
 * (But java does not require that the type be public.)
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
 * Can put two types in the same file. At most one of the top-level types in the file is allowed to be public.
 * If you do have a public type, it needs to match the filename.
 * compiled successfully.
 */
public class Demo {
}
class Demo1 {
}

/**
 * can have a class with a different name from file name, if the class is not public.
 * java does not require that the top-level type be public.
 * compiled successfully.
 */
class Demo1 {
}