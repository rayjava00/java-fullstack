import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Oca2
{
    //Aggiunta metodo per l'animazione delle scritte (vedi righe 250-255)
    public static void main(String[] args) throws InterruptedException
    {
        //Creazione scanner e random
        Scanner player = new Scanner(System.in);
        Random random = new Random();

        // Gestione delle eccezioni
        try
        {
            //INTRODUZIONE
            String border = "=========================================";
            System.out.println(border);
            System.out.println("Benvenut*!! Come ti chiami? ");
            String nome = player.nextLine();
            System.out.println("Perfetto " + nome + "! Vuoi a giocare al gioco dell'oca?");
            Thread.sleep(500);
            String[] spiega = {"E' semplicissimo! Ti basterà tirare il dado e raggiungere il traguardo (casella 63) prima del tuo avversario.", "Ma ATTENZIONE!! Alcune caselle potrebbero riservarti qualche ... sorpresa."};
            //Stampa dell'array spiega con il metodo printAnimated
            for (String benvenuto : spiega)
            {
                printAnimated(benvenuto);
            }
            System.out.println("Buon Divertimento!!");
            System.out.println(border);
        
            //Preparazione variabili per l'avanzamento sulle caselle
            int posizioneGiocatore = 0;
            int posizioneComputer = 0;
            
            //Creazione di una scelta per iniziare a giocare o per uscire dal gioco
            Thread.sleep(800);
            System.out.print("Per iniziare a giocare digita '1' oppure scrivi un qualsiasi altro numero per uscire dal gioco: ");
            int scelta = player.nextInt();
            switch(scelta)
            {
                case 1:
                //creazione del ciclo che continua finchè la posizione dell'utente o del computer non arriva o supera il 63
                while (posizioneComputer<=63 && posizioneGiocatore<=63)
                {
                    Thread.sleep(1000);
                    System.out.println("Premi invio per tirare i dadi:\n ");
                    player.nextLine();
                    int roll = random.nextInt(6) + 1 + random.nextInt(6) + 1; //due dadi che genereno numeri casuali da 1 a 6
                    posizioneGiocatore += roll; //posizione del giocatore è uguale a se stessa + il roll
                    System.out.println("Hai tirato i dadi e hai fatto " + roll + ".");
                    //Creazione delle condizioni delle caselle speciali
                    if (posizioneGiocatore == 6)
                    {
                        System.out.println("Che fortuna" + nome + "! Hai trovato un passaggio segreto che ti porta fino alla casella 12!");
                        posizioneGiocatore = 12;
                    }
                    else if (posizioneGiocatore == 9)
                    {
                        System.out.println("Ti sei perso... Per ritrovare la strada fino al traguardo devi tornare alla casella 1 :( ");
                        posizioneGiocatore = 1;
                    }
                    else if (posizioneGiocatore == 17) //Casella speciale con indovinello
                    {
                        String[] indovinello =
                        {"Incontri un uomo incappucciato: ", "\"Se risponderai correttamente al mio indovinello ti farò passare e andrai avanti di 10 caselle, ",
                        "ma se sbaglierai dovrai tornare alla casella 12!\"", "\"Mio padre fa il cantante, mia mamma è balbuziente. Il mio vestito è bianco e il mio cuore è d'oro. Chi sono?\" "};
                        for (String uomo : indovinello)
                        {
                            printAnimated(uomo);
                        }
                        System.out.println("Scrivi 'A' se pensi che io sia Elvis Presley, 'B' se pensi che io sia un uovo o 'C' se pensi che io sia una sposa");
                        String rispostaIndovinello = player.nextLine().toLowerCase();
                        //Creazione delle risposte
                        if (rispostaIndovinello.equals("b"))
                        {
                            System.out.println("Esatto! L'uomo misterioso ti lascia passare e avanzi di 10 caselle.");
                            posizioneGiocatore = 27;
                        }
                        else
                        {
                            System.out.println("Sbagliato! La risposta esatta era uovo :(\nTorni indietro di 5 caselle. ");
                            posizioneGiocatore = 12;
                        }
                    }
                    else if (posizioneGiocatore == 25)
                    {
                        System.out.println("Sei rimbalzato su un trampolino gigante: torni indietro del numero di casella indicato dai dadi");
                        posizioneGiocatore = posizioneGiocatore - roll;
                    }
                    else if (posizioneGiocatore == 32) // Casella speciale con indovinello
                    {
                        System.out.println(nome + " incontri una ragazzina con un cane: ");
                        String[] quiz =
                        {"\"Il mio cane è addestrato ad inseguire gli estranei, ma si ferma se qualcuno lo chiama per nome.",
                        "Se indovinerai il suo nome potrai continuare per la tua strada, ma se sbaglierai il mio cane ti inseguirà e dovrai scappare!",
                        "Il mio cane porta il nome di chi fu vittima di Cassio e Bruto. Come si chiama?\" "};
                        for (String ragazzina : quiz)
                        {
                            printAnimated(ragazzina);
                        }
                        System.out.println("Scrivi 'A' se pensi che il nome sia Augusto, 'B' se pensi sia Nerone oppure 'C' se pensi che il nome sia Cesare: ");
                        String rispostaQuiz = player.nextLine().toLowerCase();
                        if (rispostaQuiz.equals("b"))
                        {
                            System.out.println("Hai indovinato il nome del cane! Gli fai una carezza e avanzi fino alla casella 37");
                            posizioneGiocatore = 37;
                        }
                        else
                        {
                            System.out.println("Sbagliato! Il nome del cane è Cesare! Scappi fino alla casella 27");
                            posizioneGiocatore = 27;
                        }
                    }
                    else if (posizioneGiocatore == 40)
                    {
                        System.out.println("Fai l'autostop e avanzi di 5 caselle");
                        posizioneGiocatore = 45;
                    }
                    else if (posizioneGiocatore == 41)
                    {
                        System.out.println("Fai l'autostop ma sali in macchina con un assassino! Per sfuggirgli torni alla casella 37");
                        posizioneGiocatore = 37;
                    }
                    else if (posizioneGiocatore == 55) // Casella speciale con indovinello
                    {
                        String[] indovina =
                        {"Ci sei quasi! Ma a bloccarti la strada incontri la Sfinge che ti pone il suo indovinello:",
                        "\"Quale animale cammina su quattro zampe la mattina, due il pomeriggio e tre la sera?\" ",};
                        for (String Sfinge : indovina)
                        {
                            printAnimated(Sfinge);
                        }
                        System.out.println("Scrivi 'A' se pensi che la risposta sia la scimmia, 'B' se pensi che sia l'uomo o 'C' se pensi che sia il cane: ");
                        String rispostaSfinge = player.nextLine().toLowerCase();
                        if (rispostaSfinge.equals("b"))
                        {
                            System.out.println("Hai superato l'indovinello della Sfinge! Avanzi fino alla casella 60");
                            posizioneGiocatore = 60;
                        }
                        else
                        {
                            System.out.println("Hai sbagliato! La Sfinge ti tira una zampata e cadi nella casella 50.");
                            posizioneGiocatore = 50;
                        }
                    }
                    else if (posizioneGiocatore == 58)
                    {
                        System.out.println("Oh no! Che disastro! Inciampi, cadi e rotoli fino alla casella 1! ");
                        posizioneGiocatore = 1;
                    }
                    else if (posizioneGiocatore >= 63)
                    {
                        break;
                    }
                    Thread.sleep(800);
                    System.out.println("Ti trovi sulla casella: " + posizioneGiocatore);// Posizione aggiornata in base alle caselle speciali
                    System.out.println(border);
                    // Creazione avversario
                    Thread.sleep(800);
                    int roll2 = random.nextInt(6) + 1 + random.nextInt(6) + 1;
                    posizioneComputer += roll2;
                    System.out.println("Il computer ha fatto " + roll2 + ".");
                    //Condizioni avversario
                    if (posizioneComputer == 6)
                    {
                        System.out.println("Il computer ha trovato un passaggio segreto e avanza fino alla casella 12.");
                        posizioneComputer = 12;
                    }
                    else if (posizioneComputer == 9)
                    {
                        System.out.println("Il tuo avversario si è perso e torna alla casella 1");
                        posizioneComputer = 1;
                    }
                    else if (posizioneComputer == 17)
                    {
                        System.out.println("Un uomo incappucciato pone un indovinello al tuo avversario, ma lui sbaglia e torna indietro alla casella 12");
                        posizioneComputer = 12;
                    }
                    else if (posizioneComputer == 25)
                    {
                        System.out.println("Il computer rimbalza su un trampolino gigante e torna indietro per il numero di caselle indicato dai dadi.");
                        posizioneComputer = posizioneComputer - roll2;
                    }
                    else if (posizioneComputer == 32)
                    {
                        System.out.println("Il tuo avversario deve indovinare il nome del cane di una ragazzina per poter continuare.");
                        System.out.println("Sceglie la risposta esatta e avanza fino alla casella 37.");
                        posizioneComputer = 37;
                    }
                    else if (posizioneComputer == 40)
                    {
                        System.out.println("Il computer fa l'autostop e avanza di 5 caselle");
                        posizioneComputer = 45;
                    }
                    else if (posizioneComputer == 41)
                    {
                        System.out.println("Il computer fa l'autostop ma sale in macchina con un assassino! Per sfuggirgli torna alla casella 37");
                        posizioneComputer = 37;
                    }
                    else if (posizioneComputer == 55)
                    {
                        System.out.println("La Sfinge pone il suo famoso indovinello al tuo avversario.");
                        System.out.println("Il computer risponde corrrettamente e avanza fino alla casella 60. ");
                        posizioneComputer = 60;
                    }
                    else if (posizioneComputer == 58)
                    {
                        System.out.println("Il computer inciampa, cade e rotola fino alla casella 1!");
                        posizioneComputer = 1;
                    }
                    Thread.sleep(800);
                    System.out.println("Si trova sulla casella: " + posizioneComputer);
                }
                Thread.sleep(1000);

                if (posizioneGiocatore >= 63 && posizioneComputer < 63)
                {
                    System.out.println("Sei arrivato alla casella " + posizioneGiocatore);
                    System.out.println("Complimenti " + nome + "! Hai vinto!!");
                }
                else if (posizioneGiocatore < 63 && posizioneComputer >= 63)
                {
                    System.out.println("Oh no!! Peccato " + nome + ", il computer ti ha battut*! :( ");
                }
                else if (posizioneComputer >= 63 && posizioneGiocatore >= 63)
                {
                    System.out.println("Pareggio!!");
                }
                break;
                default:
                System.out.println("Hai scelto di non giocare! :(");
                break;
            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("Errore! L'input inserito non è valido! :(");
        }
        player.close();
    }
    //Istituisco un metodo per le scritte animate al di fuori dal metodo main
    private static void printAnimated(String action) throws InterruptedException {
        for (char c : action.toCharArray()) {
            System.out.print(c);
            Thread.sleep(20); // Ritardo di 200 millisecondi tra ogni carattere
        }
        System.out.println(); // Stampa una nuova riga alla fine di ogni azione
    }
}
