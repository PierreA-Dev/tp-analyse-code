package ex2;

public class CompteCourant extends CompteBancaire {

    private double decouvert;

    public CompteCourant(double solde, double decouvert) {
        super(solde);
        this.decouvert = decouvert;
    }

    @Override
    public void debiterMontant(double montant) {
        if (this.solde - montant >= -decouvert) {
            this.solde -= montant;
        }
    }

    public double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }
}