package ex5;

public class GrandsObjetsCaisse extends Caisse {
    public GrandsObjetsCaisse() {
        super("Grands objets");
    }

    @Override
    public boolean accepteItem(Item item) {
        return item.getPoids() > 20;
    }
}