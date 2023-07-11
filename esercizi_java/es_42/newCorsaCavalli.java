import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class newCorsaCavalli {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int posizioneCavallo = rand.nextInt(7) + 1;
        ArrayList<String> listaCavalli = new ArrayList<String>();
        listaCavalli.add("Cavallo 1");
        listaCavalli.add("Cavallo 2");
        listaCavalli.add("Cavallo 3");
        listaCavalli.add("Cavallo 4");
        listaCavalli.add("Cavallo 5");
        listaCavalli.add("Cavallo 6");
        listaCavalli.add("Cavallo 7");

        System.out.println("La lista dei cavalli partecipanti è:");
        for (String cavallo : listaCavalli) {
            System.out.println(cavallo);
        }
        int saldoIniziale = 20;
        // Punto iniziale loop
        // while (saldoIniziale > 0) {

        System.out.println("Su quale cavallo vuoi puntare: (inserisci un numero da 1 a 7)");
        int bet = input.nextInt();
        if (bet < 1 || bet > 7) {
            System.out.println("Scelta non disponibile. Devi puntare su un numero da 1 a 7.");
            return;
        }
        System.out.println("Il tuo saldo è: " + saldoIniziale);
        System.out.println("Inserisci la tua puntata: ");
        int puntata = input.nextInt();
        if (puntata > saldoIniziale) {
            System.out.println("Il tuo saldo è insufficente");
            return;
        }

        System.out.println("Hai scommesso sul cavallo " + bet + ". Inizia la gara.");
        System.out.println("Il tuo cavallo è arrivato " + posizioneCavallo);
        int saldoFinale = saldoIniziale - puntata;
        if (posizioneCavallo > 3) {
            System.out.println("Hai perso.");
            // saldoIniziale = saldoIniziale - puntata;
            System.out.println("Il tuo saldo è " + saldoFinale);
        } else if (posizioneCavallo == 1) {
            int primoPremio = puntata * 5;
            System.out.println(
                    "Complimenti! Hai vinto " + primoPremio + "euro. Il tuo saldo è "
                            + (saldoFinale + primoPremio)
                            + ".");

        } else {
            int secondoPremio = puntata * 3;
            System.out.println("Complimenti! Hai vinto " + secondoPremio + " euro. Il tuo saldo è "
                    + (saldoFinale + secondoPremio) + ".");
        }

        // System.out.println("Vuoi continuare a giocare? (Premi 0 per continuare. Premi
        // 1 per interrompere.)");
        // int scelta = input.nextInt();
        // if (sc)
        // punto finale loop
        // while (scelta == 0 || saldoFinale >= 0)

        // System.out.println("Il tuo saldo è: " + saldoFinale + "euro.");

        /*
         * if (posizioneCavallo == 1) {
         * System.out.println("Complimenti! Hai vinto " + puntata * 5 + "euro");
         * } else if (posizioneCavallo < 4 || posizioneCavallo != 1) {
         * System.out.println("Complimenti! Hai vinto " + puntata * 3 + " euro");
         * } else if (posizioneCavallo > 3) {
         * System.out.println("Hai perso.");
         * }
         * // else if (posizioneCavallo > 4)
         * // {}
         */

    }
}
