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

    public void preleva(double cifraPrelevata) {
        if (numeroMovimenti < maxMovimenti) {
            saldo = saldo - cifraPrelevata;
        } else {
            saldo = saldo - cifraPrelevata - 0.50;
        }
        numeroMovimenti++;
        System.out.println("Saldo dopo il prelievo: " + saldo);
    }

    public double mostraSaldo() {
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
