import java.util.ArrayList;
import java.util.List;

public class PrintList {
    public static void main(String[] args)
    {
     List<String> fruits = new ArrayList<String>();
     fruits.add("Mela"); //il metodo add della classe aggiunge un elemento 
     fruits.add("Banana");
     fruits.add("Arancia");
     //fruits.remove(0);// il metodo per rimuovere un elemento specifico 
     //fruits.clear(); //metodo per pulire la lista
     //fruits.size();
     fruits.isEmpty();
     for (String fruit : fruits)
     
     {
     System.out.println(fruit);
     //System.out.println(fruits.size());
     }
    // System.out.println(fruits.isEmpty());
    }
}
