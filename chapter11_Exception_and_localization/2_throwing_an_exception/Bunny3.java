/**
 * Overriding methods with exceptions
 */
class CanNotHopException extends Exception {}

class Hopper {
    public void hop() {}
}

/**
 * An overridden method may not declare any new or broader checked
exceptions than the method it inherits.

Compile error: 
Bunny3.java:11: error: hop() in Bunny3 cannot override hop() in Hopper
    public void hop() throws CanNotHopException {}  // DOES NOT COMPILE
                ^
  overridden method does not throw CanNotHopException
 */
public class Bunny3 extends Hopper {
    public void hop() throws CanNotHopException {}  // DOES NOT COMPILE
}
