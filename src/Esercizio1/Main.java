package Esercizio1;

import java.util.Random;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        int[] array = new int[5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 11);  //11 perchè l'ultimo è escluso, così sono da 1 a 10
        }
        stampaArray(array);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {

                System.out.print("Inserisci la posizione da modificare scegliendo un numero tra 1 e 5 oppure 0 per uscire: ");
                int posizione = scanner.nextInt();

                if (posizione == 0) {
                    System.out.println("---FINE---");
                    break;
                }
                System.out.print("Inserisci il nuovo valore cccompreso tra 1 e 10 o premi 0 per uscire: ");
                int valore = scanner.nextInt();

                if (valore == 0) {
                    System.out.println("---FINE---");
                    break;
                }
                if (valore > 0 && valore <= 10) {
                    if (posizione < 1 || posizione > array.length) {
                        logger.error("Posizione non valida. Deve essere compresa tra 1 e 5.");
                    } else {
                        array[posizione - 1] = valore;
                        stampaArray(array);
                    }
                }


            } catch (Exception e) {
                logger.error("Il valore inserito non è corretto ", e);
                scanner.nextLine();
            }
        }

        scanner.close();
    }


    private static void stampaArray(int[] array) {
        System.out.print("L'array contiene i seguenti numeri: ");
        for (int numero : array) {
            System.out.print(numero + ", ");
        }
        System.out.println();
    }
}
