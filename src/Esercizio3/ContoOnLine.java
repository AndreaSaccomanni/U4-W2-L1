package Esercizio3;

public class ContoOnLine extends ContoCorrente{
    private double maxPrelievo;

    public ContoOnLine(String titolare, double saldo, double maxPrelievo){
        super(titolare, saldo);
        this.maxPrelievo = maxPrelievo;
    }

    public double getMaxPrelievo() {
        return maxPrelievo;
    }

    public void stampaSaldo(){

        System.out.println("Titolare: " + getTitolare() + "\nSaldo: " + mostraSaldo() + "\nNumero movimenti: " + getNumeroMovimenti() + "\nMassimo movimenti: " + getMaxMovimenti() + "\nMassimo prelievo possibile: " + getMaxPrelievo());
    }
}
