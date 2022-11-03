/*8.	Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 Show which numbers are between 1 and 10 are in the set. (Hint: use for loop and if else)
 */

import java.util.HashSet;

public class Programme8_Hassat {
    public static void main(String[] args) {
        //create a hastag object
        HashSet<Integer> numbers = new HashSet<Integer>();
        //add the numbers
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        //show which numbers are between 1 and 10 are in set
        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                System.out.println(  i   +    " number  was found in the set");
            } else {
                System.out.println(  i   +   "  number  was not found in the set");
            }

        }
    }
}
