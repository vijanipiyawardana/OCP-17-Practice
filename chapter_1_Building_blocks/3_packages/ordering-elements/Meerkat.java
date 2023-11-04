/* header */
package structure;      // package must be first non-comment
import java.util.*;     // import must come after package
// class Meerkat
public class Meerkat {  // then comes the class
    double weight;      // fields and methods can go in either order
    public double getWeight() {
        return weight;
    }
    double height;      // another field - they don't need to be together
}

// we can put comments anywhere and blank lines are ignored

/**
 * the following order is incorrect:
 * - package and import statements are reversed
 * - a field attempts a declaration outside a class
 * */ 
// import java.util.*;
// package structure;
// String name;
// public class Meerkat {}
