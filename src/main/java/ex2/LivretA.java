package ex2;

public class LivretA extends CompteBancaire {

    private double tauxRemuneration;

    public LivretA(double solde, double tauxRemuneration) {
        super(solde);
        this.tauxRemuneration = tauxRemuneration;
    }

    @Override
    public void debiterMontant(double montant) {
        if (this.solde - montant >= 0) {
            this.solde -= montant;
        }
    }

    public void appliquerRemunerationAnnuelle() {
        this.solde += this.solde * tauxRemuneration / 100;
    }

    public double getTauxRemuneration() {
        return tauxRemuneration;
    }

    public void setTauxRemuneration(double tauxRemuneration) {
        this.tauxRemuneration = tauxRemuneration;
    }
}