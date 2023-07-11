import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class corsaCavalli {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int portafoglio = 30;

        System.out.println("Per puntare su un cavallo paga 10 euro");
        System.out.println("Scegli 0 per pagare la somma. Scegli 1 per terminare la sessione.");
        int scelta = input.nextInt();
        int vincitaPerdita;

        while (vincitaPerdita > 0) {
            if (scelta == 0) {
                vincitaPerdita = portafoglio - 10;
                String[] listaCavalli = { "Cavallo n1", "Cavallo n2", "Cavallo n3", "Cavallo n4", "Cavallo n5",
                        "Cavallo n6",
                        "Cavallo n7", "Cavallo n8", "Cavallo n9" };
                System.out.println("La lista dei cavalli partecipanti è: ");

                for (String cavallo : listaCavalli) {
                    System.out.println(cavallo);
                }

                System.out.println("Scegli il cavallo su cui vuoi puntare: ");

                String sceltaCavallo = input.next();
                Random rand = new Random();
                int posizione = rand.nextInt(9) + 1;

                System.out.println("La gara è finita. ");

                // posizione);

                if (posizione == 1) {
                    System.out
                            .println("Complimenti il tuo cavallo è arrivato" + posizione + "!" + "hai vinto 100 euro!");
                    vincitaPerdita = portafoglio + 100;

                } else if (posizione == 2) {
                    System.out.println("Ti sei posizionato al " + posizione + "posto! Hai vinto 50 euro!");
                    vincitaPerdita = portafoglio + 50;
                } else if (posizione == 3) {
                    System.out.println("Ti sei posizionato al " + posizione + "posto! Hai vinto 10 euro!");
                    vincitaPerdita = portafoglio + 10;
                } else if (posizione > 3) {
                    System.out.println("Ti sei posizionato al " + posizione + "posto.");
                }

                System.out.println("Il tuo portafoglio è:" + vincitaPerdita);
                System.out.println("Vuoi continuare a giocare?");
            }
        }

        if (scelta == 1) {
            System.out.println("Sessione di gioco terminata.");
        }

    }

    // List<String> strList = Arrays.asList(listaCavalli);
    // int len = strList.size();
    // for (int i = 0; i < listaCavalli.length; i++) {
    // int index = new Random().nextInt(len);
    // String shuffle = list.get(index);
    // System.out.println("La lista dei cavalli partecipanti è: " +
    // Arrays.toString(listaCavalli));
    // System.out.println(shuffle);

    // Collections.shuffle(strList);
    // listaCavalli = strList.toArray(new String[strList.size()]);

    // int vincitore =

    // System.out.println("");
}
