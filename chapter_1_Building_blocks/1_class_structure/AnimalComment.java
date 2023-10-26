/**
 * This is a simple Java Bean Class
 * @author Vijani Piyawardana
 * @version 17
 */
public class AnimalComment {

    // field
    private String name;

    /**
     * get the name of animal
     * @return name of animal
     */
    public String getName() {
        return name;
    }

    /**
     * set the name of animal
     * @param name - name of animal
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * run the program
     * @param args
     */
    public static void main(String args[]){
        System.out.println("Welcome!!!");
    }
}
