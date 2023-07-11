import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class listaSorteggio2
{
    public static void main(String[] args)
    {
        //Scanner input = new Scanner(System.in);
        Random rand = new Random(); //abbiamo istanziato un nuovo oggetto dalla classe random 
        List<String> elenco = new ArrayList<String>();
        elenco.add("Davide");
        elenco.add("Andrea");
        elenco.add("Alessandro");
        elenco.add("Emanuele");
        elenco.add("Tiziano");
        elenco.add("Simone");
        elenco.add("Greta");
        elenco.add("Christopher");
        elenco.add("Giorgio");
        

        //List<String> elenco2 = new ArrayList<String>();
       // List<String> elenco3 = new ArrayList<String>();
        //List<String> elenco4 = new ArrayList<String>();
       // List<String> elenco5 = new ArrayList<String>();

       // int i=elenco.size();
        while(elenco.size() >0)
        {     // finchè la dimensione della lista è maggiore di 0 il ciclo continua
            if(elenco.size() % 2 != 0)    // verifico che la dimensione della lista sia dispari
            {
                int j = rand.nextInt(elenco.size());  // definisco una variabile j con valore random e valore massimo la dimensione della lista
                System.out.print("La coppia è: " + elenco.get(j)); 
                //int k = rand.nextInt(elenco.size());
                elenco.remove(j);

            
            }
            else (elenco.size() % 2 == 0 && elenco.size()!=0)
            //while(elenco.size() % 2 == 0)
            {
                int j = rand.nextInt(elenco.size());
                System.out.println(" e " + elenco.get(j));
                //int k = rand.nextInt(elenco.size());
                elenco.remove(j);
            
            }
        }

        /*System.out.print(elenco);
        System.out.print(elenco2);
        System.out.print(elenco3);
        System.out.println(elenco4);
        System.out.println(elenco5);*/
    }

}