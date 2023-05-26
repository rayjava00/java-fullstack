import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConteggioParole {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Map<String, Integer> mappaParole = new HashMap<String, Integer>();
        System.out.println("Inserisci il testo:");
        String testo = input.nextLine();
        String[] parole = testo.split(" ");
        for (String parola : parole) {
            if (mappaParole.containsKey(parola)) {
                mappaParole.put(parola, mappaParole.get(parola) + 1);
            } else {
                mappaParole.put(parola, 1);
            }
        }
        System.out.println("La lista delle parole e il loro conteggio �:");
        for (Map.Entry<String, Integer> entry : mappaParole.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        input.close();
    }
}