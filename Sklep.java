import java.util.ArrayList;

public class Sklep {
    private ArrayList<Produkt> produkty;

    public Sklep(ArrayList<Produkt> produkty) {
        this.produkty = produkty;
    }

    public void dodajProdukt(Produkt produkt) {
        produkty.add(produkt);
    }

    public void wyswietlOferty() {
        for (Produkt produkt : produkty) {
            produkt.wyswietlInformacje();
        }
    }

    public Produkt wyszukajProduktu(String nazwa) {
        for (Produkt produkt : produkty) {
            if (produkt.getNazwa() == nazwa) {
                return produkt;
            }
        }
        return null;
    }

    public void zakupy(Produkt produkt, Klient klient) {
        produkty.remove(produkt);
    }
}
