import java.util.ArrayList;

public class Leva {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");

        // Remove an element from the list basing on name
        list.remove("Grapes");
        // Remove an element from the list basing on index
        list.remove(0);
        // Print the list
        System.out.println("List: " + list);
    }
}