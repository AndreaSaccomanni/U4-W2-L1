package Esercizio3;

public class Main {
    public static void main(String[] args) {
        ContoCorrente cc = new ContoCorrente("Mario Rossi", 200);
        try {
            System.out.println("Saldo iniziale: " + cc.getSaldo() + "€" );
            cc.preleva(50);
            cc.preleva(50);
            cc.preleva(150);
        System.out.println("Il salo attuale è: " + cc.getSaldo() + "€");
        } catch (BancaException e) {
            System.out.println(e.getMessage());;
        }

        ContoOnLine co = new ContoOnLine("Giuseppe Verdi", 250, 100);
        try {
            System.out.println("Saldo OnLine iniziale: " + co.getSaldo() + "€");
            co.preleva(20);
            co.preleva(150);
            System.out.println("Saldo OnLine disponibile: " + co.getSaldo() + "€");
        } catch (BancaException e) {

            System.out.println(e.getMessage());;

        }
    }
}
