import java.util.ArrayList;

public class Proggramme7_EmptyOrNot {
    public static void main(String[] args) {
        ArrayList<String> tubeNames = new ArrayList<String>();

        tubeNames.add("Victoria");
        tubeNames.add("Northen line");
        tubeNames.add("Jubliee line");
        tubeNames.add("Piccadilly line");
        tubeNames.add("Baker Street");

        //check if array list is empty or not
        System.out.println("Original array list" + tubeNames);
        System.out.println("Checking above array list is empty or not!" + tubeNames.isEmpty());
        // removing all the tubenames is empty
        tubeNames.removeAll(tubeNames);
        System.out.println("Array list after remove all elements "+tubeNames);
        System.out.println("Checking the above array list is empty or not! "+tubeNames.isEmpty());


    }
}