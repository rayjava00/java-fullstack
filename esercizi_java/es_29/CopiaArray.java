import java.util.Scanner;
import java.util.Arrays;

public class CopiaArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Iserisci la dimensione dell'array: ");
        int dimensione = input.nextInt(); // inseriamo la dimennsione dell'array
        int[] array = new int[dimensione]; // crea un array della dimensione da noi inserita
        System.out.println("Inserisci gli elementi dell'array: ");
        for (int i = 0; i < dimensione; i++) {
            array[i] = input.nextInt();
        }
        int[] arrayCopia = new int[dimensione];
        for (int i = 0; i < dimensione; i++) {
            arrayCopia[i] = array[i];
        }
        System.out.println("L'array originale è: " + Arrays.toString(array));
        System.out.println("L'array copiato è: " + Arrays.toString(arrayCopia));
        input.close();
    }

}
