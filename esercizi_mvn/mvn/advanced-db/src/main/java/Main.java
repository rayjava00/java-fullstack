import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleziona un'opzione: ");
        System.out.println("1: Crea il database e le tabelle");
        System.out.println("2: Inserisci i dati nelle tabelle");
        System.out.println("3: Salva i dati in un file CSV");

        int scelta = scanner.nextInt();

        switch (scelta) {
            case 1:
                CreaDBCollegato.main(args);
                break;
            case 2:
                InserisciDatiCollegati.main(args);
                break;
            case 3:
                SalvaInCSV.main(args);
                break;
            default:
                System.out.println("Scelta non valida. Inserisci 1,2 o 3");
        }
        scanner.close();
    }
}
