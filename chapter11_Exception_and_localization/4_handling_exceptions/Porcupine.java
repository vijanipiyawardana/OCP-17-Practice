/*
 * Chaining catch blocks
 * Three custom exceptions
 * All 3 are unchecked exceptions as they directly or inderectly extent RuntimeException.
*/

class AnimalsOutForAWalk extends  RuntimeException {}

class ExhibitClosed extends RuntimeException {}

class ExhibitClosedForLunch extends ExhibitClosed {}

public class Porcupine {
    
    public void visitPorcupine() {
        try {
            seeAnimal();
        } catch (AnimalsOutForAWalk e) {     // first catch block
            System.out.println("try back later");
        } catch (ExhibitClosed e) {             // second catch block
            System.out.println("not today");
        }
    }

    void seeAnimal() {
        System.out.println("sees animal");
    }

    public static void main(String[] args) {
        Porcupine p = new Porcupine();
        p.visitPorcupine();
    }
}
