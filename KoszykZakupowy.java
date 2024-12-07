import java.util.ArrayList;
import java.util.HashMap;

public class KoszykZakupowy {
    private HashMap<Produkt, Integer> listaProduktow;

    public KoszykZakupowy(HashMap<Produkt, Integer> listaProduktow) {
        this.listaProduktow = listaProduktow;
    }

    public void dodajProdukt(Produkt produkt, int ilosc) {
        if (produkt.getIloscNaMagazynie() <= ilosc) {
            return;
        }

        listaProduktow.put(produkt, ilosc);
        produkt.usunZMagazynu(ilosc);
    }

    public void wyswietlZawartoscKoszyka() {
        for (Produkt produkt : listaProduktow.keySet()) {
            System.out.println("Produkt " + produkt.getNazwa());
        }
    }

    public double obliczCalkowitaWartosc() {
        double sum = 0;
        for (Produkt produkt : listaProduktow.keySet()) {
            sum += produkt.getCena();
        }
        return sum;
    }

    public HashMap<Produkt, Integer> getListaProduktow() {
        return listaProduktow;
    }

    public void setListaProduktow(HashMap<Produkt, Integer> listaProduktow) {
        this.listaProduktow = listaProduktow;
    }

    @Override
    public String toString() {
        return "KoszykZakupowy{" +
                "listaProduktow=" + listaProduktow +
                '}';
    }
}
