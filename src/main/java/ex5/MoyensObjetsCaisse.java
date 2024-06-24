package ex5;

public class MoyensObjetsCaisse extends Caisse {
    public MoyensObjetsCaisse() {
        super("Moyens objets");
    }

    @Override
    public boolean accepteItem(Item item) {
        return item.getPoids() >= 5 && item.getPoids() <= 20;
    }
}