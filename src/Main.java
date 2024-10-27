import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    /* STATISTIKA RIJECI
     * Napravi program koji učitava rečenicu i ispisuje:
     * 1. Sve riječi duže od 5 slova
     * 2. Najduzu rijec
     * 3. Prosjecnu duljinu rijeci
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesi neku rečenicu: ");
        String unesenaRecenica = scanner.nextLine();

        List<String> recenicaLista = new ArrayList<>();

        for (String rijec : unesenaRecenica.split(" ")) {
            recenicaLista.add(rijec);
        }

        List<String> rijeciDuzeOdPet = rijeciDuzeOdPetSlova(recenicaLista);
        String najduzaRijec = najduzaRijec(recenicaLista);
        float prosjekDuljine = prosjecnaDuljinaRijeci(recenicaLista);

        System.out.println("Riječi duže od 5 slova: " + rijeciDuzeOdPet);
        System.out.println("Najduža riječ: " + najduzaRijec);
        System.out.printf("Prosječna duljina riječi: " + prosjekDuljine);
    }

    private static List<String> rijeciDuzeOdPetSlova(List<String> recenica) {
        List<String> duzeOdPet = new ArrayList<>();
        for (String rijec : recenica) {
            if (rijec.length() > 5) {
                duzeOdPet.add(rijec);
            }
        }
        return duzeOdPet;
    }

    private static String najduzaRijec(List<String> recenica) {
        String najduza = "";
        for (String rijec : recenica) {
            if (rijec.length() > najduza.length()) {
                najduza = rijec;
            }
        }
        return najduza;
    }

    private static float prosjecnaDuljinaRijeci(List<String> recenica) {
        float ukupnaDuljina = 0;
        for (String rijec : recenica) {
            ukupnaDuljina += rijec.length();
        }
        return ukupnaDuljina / recenica.size();
    }
}
