

import java.util.Scanner;

public class calcolaPerimetroArea//ricordarsi di cambiare il nome della classe
{
    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    
    int lato;
    System.out.print("Inserisci la lunghezza del lato: ");
    lato = input.nextInt();
    /*int perimetro = lato * 4; 
    int area = lato * lato ;*/
    
    if (lato > 400 || lato < 1)
    System.out.println("Il numero non è valido");
  
    
    else {
    System.out.println("Il perimetro è: "+ lato * 4);
    System.out.print("L'area é: " + lato*lato);
     }


   
        
    }    
}   

/*note per i collaboratori */