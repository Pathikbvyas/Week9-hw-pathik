/*4.	Write a Java program to create a new array list,
add some colours (string) and printout the collection using for each loop.
 */

import java.util.ArrayList;
import java.util.List;

public class Programme4_NewArrayList {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println(list_Strings);
        for (int i = 0; i < list_Strings.size(); i++) {
            System.out.println(list_Strings.get(i));
        }
    }


}