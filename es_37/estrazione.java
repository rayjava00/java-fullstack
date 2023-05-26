import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class estrazione {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // creo un nuovo scanner
        Random rand = new Random(); // creo un nuovo random
        List<String> listaEstratti = new ArrayList<String>();
        System.out.println("Inserisci gli studenti da estrarre: (premi \"fine\" per interrompere l'inserimento.)");
        String nomiSorteggio = input.nextLine();
        while (!nomiSorteggio.equals("fine")) {
            listaEstratti.add(nomiSorteggio);
            nomiSorteggio = input.nextLine();
        }
        if (listaEstratti.size() % 2 == 0)

        {
            while (listaEstratti.size() > 0) {
                while (listaEstratti.size() % 2 == 0 && listaEstratti.size() != 0)// se è pari
                {
                    {
                        int j = rand.nextInt(listaEstratti.size());
                        System.out.print("La coppia è " + listaEstratti.get(j));
                        listaEstratti.remove(j);
                    }
                    while (listaEstratti.size() % 2 != 0) // se è dispari
                    {
                        int j = rand.nextInt(listaEstratti.size());
                        System.out.println(" e " + listaEstratti.get(j));
                        listaEstratti.remove(j);
                    }
                    // while (listaEstratti.size() > 1)
                    {
                    }
                }
            }
        } else {
            while (listaEstratti.size() > 1) {
                while (listaEstratti.size() % 2 != 0) {
                    int j = rand.nextInt(listaEstratti.size());
                    System.out.print("La coppia è: " + listaEstratti.get(j));
                    listaEstratti.remove(j);

                }
                while (listaEstratti.size() % 2 == 0 && listaEstratti.size() != 0) {
                    int j = rand.nextInt(listaEstratti.size());
                    System.out.println(" e " + listaEstratti.get(j));
                    listaEstratti.remove(j);

                }
            }
            System.out.println("rimane fuori " + listaEstratti);
            input.close();
        }
    }
}
