package Esercizio3;

public class ContoCorrente {
    private String titolare;
    private int numeroMovimenti;
    private final int maxMovimenti = 50;
    private double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.numeroMovimenti = 0;
    }

    public void preleva(double cifraPrelevata) throws BancaException {
        if (numeroMovimenti < maxMovimenti) {
            this.saldo = this.saldo - cifraPrelevata;
            System.out.println("Hai prelevato: " + cifraPrelevata + "€");
        } else {
            this.saldo = this.saldo - cifraPrelevata - 0.50;
        }
        if (cifraPrelevata > saldo) {
            throw new BancaException("Prelievo non disponibile: \nVuoi prelevare " + cifraPrelevata + " ma il saldo è di " + (this.saldo + cifraPrelevata));
        }

        if (this.saldo < 0) {
            throw new BancaException("Il conto è in rosso");
        }
        numeroMovimenti++;

    }


    public double getSaldo() {
        return saldo;
    }

    public String getTitolare() {
        return titolare;
    }

    public int getNumeroMovimenti() {
        return numeroMovimenti;
    }

    public int getMaxMovimenti() {
        return maxMovimenti;
    }
}
