import java.util.ArrayList;
import java.util.Collections;

public class Sor {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");
        list.add("Strawberry");

        // Sort the list
        Collections.sort(list);

        // Invert the list
        Collections.reverse(list);

        // Print the sorted list
        System.out.println("Sorted list: " + list);
    }
}