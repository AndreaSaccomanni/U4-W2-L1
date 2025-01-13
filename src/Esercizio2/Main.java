package Esercizio2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Esercizio2.Main.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km = 0, litriConsumati = 0;

        try {
            System.out.println("Scrivi il numero dei km percorsi: ");
            km = scanner.nextInt();
            if (km < 0) {
                logger.error("Il valore dei chilometri non può essere minore di 0.");
                return;
            }
            System.out.println("Valore registrato, km = " + km);


            System.out.println("Scrivi il numero dei litri di carburante consumati: ");
            litriConsumati = scanner.nextInt();
            if (litriConsumati <= 0) {
                logger.error("Il valore dei litri consumati deve essere maggiore di zero.");
                return;
            }
            System.out.println("Valore registrato, litri consumati = " + litriConsumati);


            double rapporto = (double) km / litriConsumati;
            System.out.println("Il rapporto km/l è: " + rapporto);

        } catch (NumberFormatException e) {
            logger.error("Errore!! Devi inserire un numero intero: " + e.getMessage());
        } catch (Exception e) {
            logger.error("Errore inaspettato: " + e);
        }
    }
}
