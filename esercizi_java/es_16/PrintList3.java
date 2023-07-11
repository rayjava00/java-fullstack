import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintList3

 {
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
     List<String> fruits = new ArrayList<String>();
     fruits.add("Mela"); //il metodo add della classe aggiunge un elemento 
     fruits.add("Banana");
     fruits.add("Arancia");
     System.out.println("Scegli 0 per aggiungere un elemento. Scegli 1 per eliminare.");
       int scelta = input.nextInt();
           if (scelta == 0)
             {  
           System.out.println("Scrivi il frutto che vuoi inserire: ");
           String daAggiung = input.next(); //dichiaro una variabile daAgg come input 
           fruits.add(daAggiung); //aggiunge l'input da noi inserito
             }
         else if (scelta == 1) 
         {
            System.out.println("Quale frutta vuoi eliminare?: ");
            String daElim = input.next();
            fruits.remove(daElim);
         } 
          else { 
            System.out.println("Non hai scelto niente");
          }
     
     System.out.println("Nuova lista: ");
   
     for (String fruit : fruits)
     
     {
     System.out.println(fruit);
     
     }
    input.close();
    }
 }