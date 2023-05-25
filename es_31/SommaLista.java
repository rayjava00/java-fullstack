import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SommaLista {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> lista = new ArrayList<Integer>();
        System.out.println("Inserisci gli elementi della lista (inserisci 0 per terminare l'inserimento):");
        int elemento = input.nextInt();
        while (elemento != 0) {
            lista.add(elemento);// l'elemento della lista viene agg solamente se non è 0, appena inserisco lo 0
                                // i num successivi non vengono letti
            elemento = input.nextInt();
        }
        int somma = 0;
        for (Integer numero : lista) { // per ogni numero della lista
            somma += numero;
        }
        System.out.println("La somma degli elementi della lista è" + somma + ".");
        input.close();

    }

}
