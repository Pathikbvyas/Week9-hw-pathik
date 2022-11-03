import java.util.ArrayList;

/*6.	Write a Java program to retrieve an element (at a specified index) from a given array list
 */
public class Progamme6_RetriveanElement {
    public static void main(String[] args) {
        //creating an empty integer array
        ArrayList<Integer> arr = new ArrayList<Integer>(4);

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
// print statements
        System.out.println("List:"+ arr);
        //getting element
        int element=arr.get(2);
        System.out.println("the element at index 2 is "
                + element);
    }
}