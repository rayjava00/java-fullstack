

import java.util.Scanner; 
public class calcolaPerimetroArea 


{
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
      System.out.print("Inserisci la lunghezza del lato: ");
      int lato; 
      lato = input.nextInt();
      int area;
      int perimetro;
      area = lato*lato;
      perimetro = lato*4;
      System.out.println("Il lato inserito: "+lato);//concateno testo e variabili
      System.out.println ("L'area è: "+area);
      System.out.println ("Il perimetro è: "+perimetro); 
      input.close(); 
    }    
}   


