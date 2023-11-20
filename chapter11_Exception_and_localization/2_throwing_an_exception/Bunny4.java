/**
 * Overriding methods with exceptions
 */
class CanNotHopException extends Exception {}

class Hopper {
    public void hop() throws CanNotHopException {}
}

public class Bunny4 extends Hopper {
    public void hop() {} // This is fine
}
