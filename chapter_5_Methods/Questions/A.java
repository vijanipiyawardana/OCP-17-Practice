public class A {
  public A() {}
  public A(int i) { this(); }
}
class B extends A {
  public boolean B(String msg) { return false; }
}
class C extends B {
  private C() { super(); }
  public C(String msg) { this(); }
  public C(int i) {}
}

/**
 * Detailed version of same code
 */
// public class A {
//   public A() {
//     System.out.println("Default constructor of A");
//   }
//   public A(int i) { 
//     this(); 
//     System.out.println("Int constructor of A - " + i);
// }
// }
// class B extends A {
//   public boolean B (String msg) {     // <-- this is a method
//     return false; 
//   }  
// }
// class C extends B {
//   private C() {    // <-- this constructor is private
//     super(); 
//   } 
//   public C(String msg) { 
//     this(); 
//     System.out.println("String constructor of C - " + msg);
//   }
//   public C(int i) {
//     System.out.println("Int constructor of C - " + i);
//   }
// }

/**
 * ** Note: removed public keyword from class B and C to have all classes in one file named A.
 * 
 * Compiled successfully.
 * Answer: B
 * 
 * A. The code will fail to compile.
 * B. The constructor in A that takes an int as an argument will never be called as a result of constructing an object of class B or C.
 * C. Objects of class B cannot be constructed.
 * D. At most, one constructor of each class is called as a result of constructing an object of class C.
 */

class Main {
    public static void main(String args[]) {
        // A a = new A();          // <-- 1
        // A a1 = new A(1);      // <-- 2
        // B b = new B();          // <-- 3
        // B b2 = new B(2);        // <-- 4
        // C c = new C();          // <-- 5
        // C c2 = new C("C");  // <-- 6
        // C c3 = new C(3);      // <-- 7
    }
}

/**
 * Explanation:
 * 
 * 1 - Calls only default constructor of class A.
 * 2 - Calls default constructor of class A and int argument constructor of class A.
 * 3 - Calls default constructor of class A. 
 *     Since B automatically inserts its default constructor which calls its super() inside it.
 * 4 - Compile error. The constructor B(int) is undefined.
 * 5 - Compile error. The constructor C() is not visible, since it is private.
 * 6 - Calls default constructor of class A and String argument constructor of class C.
 * 7 - Calls default constructor of class A and int argument constructor of class C.
 */