package ex5;

import java.util.ArrayList;
import java.util.List;

public abstract class Caisse implements Interface_caisse {

    private String nom;
    private List<Item> items;

    public Caisse(String nom) {
        this.nom = nom;
        this.items = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        if (accepteItem(item)) {
            items.add(item);
        }
    }
}
