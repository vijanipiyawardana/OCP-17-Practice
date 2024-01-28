public class Operator {

    public static void main(String[] args) {
        
        /*
        * Java operators are not necessarily evaluated from left-­to-­right order. 
        * this expression evaluated from right to left
        * value is automatically promoted from 9 to 9.0
        */
        int cookies = 4;
        double reward = 3 + 2 * --cookies;
        System.out.println(reward);     // 9.0

        /*
         * operator precedence
         */
        int height = 2;
        int length = 4;
        var perimeter = 2 * height + 2 * length;
        System.out.println(perimeter);  // 12
    }
}
