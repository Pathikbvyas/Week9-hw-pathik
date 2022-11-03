/*5.	Write a Java program to iterate through all elements in an array list using Iterator.
 */

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Programme5_Iterator {
    public static void main(String[] args) {
        // Declaring and initializing ArrayList
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        // Iterating ArrayList using Iterator
        Iterator it = numbers.iterator();

        while (it.hasNext())

            // Print the elements of ArrayList
            System.out.print(it.next() + " ");
    }
}