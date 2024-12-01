import java.util.ArrayList;

public class KoszykZakupowy {
    private ArrayList<Produkt> listaProduktow;

    public KoszykZakupowy(ArrayList<Produkt> listaProduktow) {
        this.listaProduktow = listaProduktow;
    }

    public void dodajProdukt(Produkt produkt, int ilosc) {
        if (produkt.getIloscNaMagazynie() <= ilosc) {
            return;
        }

        for (int i = 0; i < ilosc; i++) {
            listaProduktow.add(produkt);
        }
        produkt.usunZMagazynu(ilosc);
    }

    public void wyswietlZawartoscKoszyka() {
        for (Produkt produkt : listaProduktow) {
            System.out.println("Produkt " + produkt.getNazwa());
        }
    }

    public double obliczCalkowitaWartosc() {
        double sum = 0;
        for (Produkt produkt : listaProduktow) {
            sum += produkt.getCena();
        }
        return sum;
    }
}
