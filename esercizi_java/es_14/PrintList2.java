import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintList2
 {
    public static void main(String[] args)
    {
     List<String> fruits = new ArrayList<String>();
     fruits.add("Mela"); //il metodo add della classe aggiunge un elemento 
     fruits.add("Banana");
     fruits.add("Arancia");
     Scanner input = new Scanner(System.in);
     System.out.println("Quale frutta vuoi eliminare?: ");
     int daElim = input.nextInt();
     fruits.remove(daElim -1);
     
     for (String fruit : fruits)
     
     {
     System.out.println(fruit);
     
     }
    
    }
  
 }