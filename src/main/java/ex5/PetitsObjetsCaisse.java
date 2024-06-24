package ex5;

public class PetitsObjetsCaisse extends Caisse {
    public PetitsObjetsCaisse() {
        super("Petits objets");
    }

    @Override
    public boolean accepteItem(Item item) {
        return item.getPoids() < 5;
    }
}