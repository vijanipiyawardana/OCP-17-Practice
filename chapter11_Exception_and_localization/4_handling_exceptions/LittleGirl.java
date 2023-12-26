public class LittleGirl {

    void explore() {
        try {
            fall();
            System.out.println("Never get here");
        } catch (RuntimeException e) {
            getUp();
        }
        seeAnimals();
    }

    void fall() {
        throw new RuntimeException();
        // System.out.println("Little girl didn't fall.");
    }

    void getUp() {
        System.out.println("Little girl gets up after falling.");
    }

    void seeAnimals() {
        System.out.println("Little girl sees animals.");
    }

    public static void main(String[] args) {
        LittleGirl girl = new LittleGirl();
        girl.explore();
    }
    
}
