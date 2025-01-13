package Esercizio3;

public class ContoOnLine extends ContoCorrente {
    private double maxPrelievo;

    public ContoOnLine(String titolare, double saldo, double maxPrelievo) {
        super(titolare, saldo);
        this.maxPrelievo = maxPrelievo;
    }

    public double getMaxPrelievo() {
        return maxPrelievo;
    }

    public void stampaSaldo() {
        System.out.println("Titolare: " + getTitolare() + "\nSaldo: " + getSaldo() + "\nNumero movimenti: " + getNumeroMovimenti() + "\nMassimo movimenti: "
                + getMaxMovimenti() + "\nMassimo prelievo possibile: " + getMaxPrelievo());
    }

    @Override
    public void preleva(double cifraPrelevata) throws BancaException {
        if (cifraPrelevata <= maxPrelievo) {
            super.preleva(cifraPrelevata);

        }else if(cifraPrelevata > this.getSaldo()){
            throw new BancaException("Prelievo non disponibile: \nVuoi prelevare " + cifraPrelevata + " ma il saldo è di " + super.getSaldo());


        }
        if (cifraPrelevata > maxPrelievo) {
            throw new BancaException("Prelievo non disponibile: \nVuoi prelevare " + cifraPrelevata + " ma il prelievo massimo è di " + maxPrelievo);

        }
    }

}
