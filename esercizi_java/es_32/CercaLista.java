import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class CercaLista {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> lista = new ArrayList<String>();
        System.out.println("Inserisci gli elementi della lista (inserisci \"fine\" per terminare l'inserimento):");
        String elemento = input.nextLine();
        while (!elemento.equals("fine")) {
            lista.add(elemento);
            elemento = input.nextLine();
        }
        System.out.println("Inserisci l'elemento da cercare: ");
        String elementoCercato = input.nextLine();
        int indice = lista.indexOf(elementoCercato);
        if (indice != -1) {
            System.out.println("L'elemento si trova all'indice " + indice + "della lista.");
        } else {
            System.out.println("L'elemento non è presente nella lista.");
        }
        input.close();
    }
}
