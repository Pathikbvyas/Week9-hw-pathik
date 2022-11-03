/*9.	Create a HashMap object called people that will store String keys and
Integer values: And use for each loop to iterate the value from Map.
 */

import java.util.HashMap;
import java.util.Map;

public class Programme9_HasMap {
    public static void main(String[] args) {
        //create a hasmap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        //store string ans integer values :names and age
        people.put("pooja", 30);
        people.put("Ronak", 32);
        people.put("Alex", 33);


        for (Map.Entry<String,Integer>peopleName  : people.entrySet()  ) {
            System.out.println(peopleName);


        }
    }


}