import java.util.HashMap;

public class Magazyn {
    private HashMap<Produkt, Integer> produkty;

    public Magazyn(HashMap<Produkt, Integer> produkty) {
        this.produkty = produkty;
    }

    public HashMap<Produkt, Integer> getProdukty() {
        return produkty;
    }

    public void setProdukty(HashMap<Produkt, Integer> produkty) {
        this.produkty = produkty;
    }

    @Override
    public String toString() {
        String str = "";

        for (Produkt p : produkty.keySet()) {
            str += p.toString() + " " + produkty.get(p) + "\n";
        }

        return str;
    }
}
