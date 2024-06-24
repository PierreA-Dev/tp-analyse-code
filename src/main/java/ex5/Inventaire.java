package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

    private List<Caisse> caisses;

    public Inventaire() {
        caisses = new ArrayList<>();
        caisses.add(new PetitsObjetsCaisse());
        caisses.add(new MoyensObjetsCaisse());
        caisses.add(new GrandsObjetsCaisse());
    }

    public void addItem(Item item) {
        for (Caisse caisse : caisses) {
            if (caisse.accepteItem(item)) {
                caisse.addItem(item);
                break; // Item ajouté, on peut sortir de la boucle
            }
        }
    }

    public int taille() {
        int taille = 0;
        for (Caisse caisse : caisses) {
            taille += caisse.getItems().size();
        }
        return taille;
    }
}
