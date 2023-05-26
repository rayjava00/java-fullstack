import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listaSpesa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> listaProdotti = new ArrayList<String>();
        List<String> carrello = new ArrayList<String>();
        listaProdotti.add("accendino");
        listaProdotti.add("tabacco");
        listaProdotti.add("filtri");
        listaProdotti.add("cartine");
        listaProdotti.add("caramelle");
        listaProdotti.add("bigliettobus");
        System.out.println("La lista dei prodotti è: ");
        for (String prodotto : listaProdotti) {
            System.out.println(prodotto);
        }
        System.out.println("Che prodotto vuoi acquistare: (Inserisci \"fine\" quando hai finito di acquistare.) ");
        String scelta = input.nextLine();
        while (!scelta.equals("fine")) {
            carrello.add(scelta);
            scelta = input.nextLine();
            listaProdotti.remove(scelta);

        }
        System.out.println("Hai aggiunto al carrello" + carrello);
        System.out.println(
                "Vuoi procedere al pagamento? Digita 0 se vuoi continuare, 1 Se vuoi annullare, digita 2 se vuoi continuare ad acquistare.");
        int scelta2 = input.nextInt();
        if (scelta2 == 0) {
            System.out.println("Hai acquistato: " + carrello);
        } else if (scelta2 == 1) {
            System.out.println("Hai annullato il pagamento");
        } else if (scelta2 == 2) {
            System.out.println("Che prodotto vuoi acquistare: (Inserisci \"fine\" quando hai finito di acquistare.) ");
            scelta = input.nextLine();
            while (!scelta.equals("fine")) {
                carrello.add(scelta);
                scelta = input.nextLine();
                listaProdotti.remove(scelta);

            }
            System.out.println("Hai aggiunto al carrello" + carrello);
        }
    }
}

// creiamo lista carrello
// creiamo una lista di prodotti

// aggiungiamo prodotti a lista prodotti
// stampa lista prodotti
// stampa "che prodotto vuoi acquistare?"
// input
// rimuovi dalla lista prodotti e aggiungi a lista carrello
// nel carrello hai x vuoi acquistare? permi si o no
// hai acquistato x
// creo variabile portafoglio