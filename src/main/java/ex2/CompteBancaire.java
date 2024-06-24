package ex2;

/**
 * Représente un compte bancaire générique
 */
public abstract class CompteBancaire {

    protected double solde;

    public CompteBancaire(double solde) {
        this.solde = solde;
    }

    public void ajouterMontant(double montant) {
        this.solde += montant;
    }

    public abstract void debiterMontant(double montant);

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}