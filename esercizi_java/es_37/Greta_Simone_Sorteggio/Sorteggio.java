import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Sorteggio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // creo un nuovo scanner
        Random rand = new Random(); // creo un nuovo random
        List<String> listaSorteggiati = new ArrayList<String>();
        System.out.println("Inserisci il tuo nome: ");
        String nomeUtente = input.nextLine();
        System.out.println("Ciao " + nomeUtente + "!");
        System.out.println("Inserisci i nomi da sorteggiare (e scrivi \"fine\" per terminare l'inserimento):");
        String nomiSorteggio = input.nextLine();
        while (!nomiSorteggio.equals("fine")) // creo un ciclo while che mi permette di inserire i nomi finchè non
                                              // scrivo fine
        {
            listaSorteggiati.add(nomiSorteggio);
            nomiSorteggio = input.nextLine();
        }
        if (listaSorteggiati.size() % 2 == 0) // se la lista è pari
        {
            while (listaSorteggiati.size() > 0) { // finchè la lista è maggiore di zero
                while (listaSorteggiati.size() % 2 == 0 && listaSorteggiati.size() != 0) {
                    int j = rand.nextInt(listaSorteggiati.size());
                    System.out.print("La coppia è: " + listaSorteggiati.get(j)); // trovo l'elemento della lista che
                                                                                 // corrisponde al random
                    listaSorteggiati.remove(j);// e lo rimuovo
                }
                while (listaSorteggiati.size() % 2 != 0) {
                    int j = rand.nextInt(listaSorteggiati.size());
                    System.out.println(" e " + listaSorteggiati.get(j));
                    listaSorteggiati.remove(j);
                }
            }
        } else // se la lista è dispari
        {
            while (listaSorteggiati.size() > 1) {
                while (listaSorteggiati.size() % 2 != 0) {
                    int j = rand.nextInt(listaSorteggiati.size());
                    System.out.print("La coppia è: " + listaSorteggiati.get(j));
                    listaSorteggiati.remove(j);

                }
                while (listaSorteggiati.size() % 2 == 0 && listaSorteggiati.size() != 0) {
                    int j = rand.nextInt(listaSorteggiati.size());
                    System.out.println(" e " + listaSorteggiati.get(j));
                    listaSorteggiati.remove(j);

                }
            }
            System.out.println("E' rimasto fuori dalle coppie: " + listaSorteggiati);// se la lista è dispari una
                                                                                     // persona rimarrà fuori dalle
                                                                                     // coppie
        }
        input.close();
    }

}
