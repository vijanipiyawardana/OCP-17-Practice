public class Scope {

    /**
     * how many varables that are scoped to this method: 2
     * The piecesOfCheese variable is a method parameter.
     * Neither variable can be used outside of where it is defined.
     */
    public void eat(int piecesOfCheese) {
        int bitesOfCheese = 1;
    }

    /*
     * Limiting scope
     */
    public void eatIfHungry(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
        } // bitesOfCheese goes out of scope here
        System.out.println(bitesOfCheese); // DOES NOT COMPILE
    }

    /*
     * These smaller contained blocks can reference variables defined in the larger
     * scoped blocks, but not vice versa.
     */
    public void eatIfHungry(boolean hungry) {
        if (hungry) {
            int bitesOfCheese = 1;
            {
                var teenyBit = true;
                System.out.println(bitesOfCheese);
            }
        }
        System.out.println(teenyBit); // DOES NOT COMPILE
    }

    /**
     * Tracing scope
     * ex: five local variables goes into and out of scope
     * there are three blocks: while, if, method
     */
    public void eatMore(boolean hungry, int amountOfFood) {
        int roomInBelly = 5;
        if (hungry) {
            var timeToEat = true;
            while (amountOfFood > 0) {
                int amountEaten = 2;
                roomInBelly = roomInBelly -­amountEaten;
                amountOfFood = amountOfFood -­amountEaten;
            }
        }
        System.out.println(amountOfFood);
    }

}
