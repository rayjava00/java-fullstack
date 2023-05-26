import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Corrisp {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Map<Integer, Integer> tabellaConversione = new LinkedHashMap<Integer, Integer>();
    tabellaConversione.put(0, 0);
    tabellaConversione.put(50, 5);
    tabellaConversione.put(100, 10);
    tabellaConversione.put(150, 15);
    tabellaConversione.put(200, 20);
    tabellaConversione.put(250, 25);
    tabellaConversione.put(300, 30);
    tabellaConversione.put(350, 35);
    tabellaConversione.put(400, 40);
    tabellaConversione.put(450, 45);
    tabellaConversione.put(500, 50);
    System.out.println("Inserisci il punteggio:");
    int punteggio = input.nextInt();
    int punteggioTotale = 0;
    for (Map.Entry<Integer, Integer> entry : tabellaConversione.entrySet()) {
      if (punteggio >= entry.getKey()) {
        punteggioTotale = entry.getValue();
      } else {
        break;
      }
    }
    System.out.println("Il punteggio totale è: " + punteggioTotale);

    input.close();
  }
}