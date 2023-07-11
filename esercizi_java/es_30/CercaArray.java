import java.util.Scanner;

public class CercaArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci la dimensione dell'array: ");// metodo input
        int dimensione = input.nextInt();
        int[] array = new int[dimensione]; // dimensione specificata dall'utente
        System.out.println("Inserisci gli elementi dell' array: ");
        for (int i = 0; i < dimensione; i++) { // il ciclo for continua finchè il contatore raggiunge la dimensione
                                               // inserita dall'utente
            array[i] = input.nextInt(); // assegno gli input dell'utente ad un array della dim del contatore
        }
        System.out.println("Inserisci il numero da cercare: ");
        int numeroCercato = input.nextInt(); // definisco una variabile e la inizializzo con un valore pari all'input
                                             // dell'utentes
        int index = -1;// creo una variabile a cui do il valore -1 che rappresenta l'indice di un
                       // elemento che non esiste
        for (int i = 0; i < dimensione; i++) {
            if (array[i] == numeroCercato) { // se un determinato indice trovi il numero che ho scelto
                index = i;
                break; // esci dal programma
            }
        }
        if (index != -1) {
            System.out.println("Il numero si trova all'indice " + index + "dell'array.");
        } else {
            System.out.println("Il numero non è presente nell'array.");
        }
        input.close();
    }
}
