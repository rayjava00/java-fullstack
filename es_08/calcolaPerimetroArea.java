

import java.util.Scanner; //libreria che serve per utilizzare i metodi di scanner

public class calcolaPerimetroArea 


{
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);//creo un'oggetto scanner chiamato input
      System.out.print("Inserisci la lunghezza del lato: ");
      int lato; //questo sarà il paratmetro che utilizzerò per i calcoli 
      lato = input.nextInt();
      int area;
      int perimetro;
      //lato = 5;
      area = lato*lato;
      perimetro = lato*4;
      System.out.println(lato);
      System.out.println (area);
      System.out.println (perimetro); 
      input.close(); //la chiusura è opzionale 
    }    
}   


