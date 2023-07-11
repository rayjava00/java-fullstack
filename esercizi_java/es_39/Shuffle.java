import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");
        list.add("Strawberry");
        System.out.println("La lista iniziale è:" + list);
        // Shuffle the list
        Collections.shuffle(list);
        System.out.println("La lista riordinata è:");
        // Print the shuffled list
        // System.out.println("Shuffled list: " + list);
        for (String elemento : list) {
            System.out.println(elemento);
        }
    }
}