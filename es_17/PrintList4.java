import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class PrintList4 {
    public static void main(String[] args)
    {
     List<String> cart = new ArrayList<String>();
     List<String> fruits = new ArrayList<String>();
     fruits.add("Mela"); //il metodo add della classe aggiunge un elemento 
     fruits.add("Banana");
     fruits.add("Arancia");
     
while (fruits.isEmpty() == false){


     System.out.println("I frutti disponibili sono:");
     for (String fruit : fruits)
     {
     System.out.println(fruit);
     
     }
     Scanner input = new Scanner(System.in);
     
     System.out.println("Che frutta vuoi aggiungere al carrello?");
    
     
     String purchase = input.next();
     cart.add(purchase);
     fruits.remove(purchase);
    System.out.println("I tuoi acquisti sono: ");
    for (String fruit2 : cart )
     {
       System.out.println(fruit2);
     }
     
  
     System.out.println("I frutti disponibili sono:");
     for (String fruit : fruits)
     {
     System.out.println(fruit);
     
     }
     fruits.isEmpty();
    }

    }
}
