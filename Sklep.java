import java.time.LocalDate;
import java.time.ZoneId;
import java.util.HashMap;

public class Sklep {
    private HashMap<Produkt, Integer> produkty;
    private Magazyn magazyn;
    private String nazwaSklepu;
    private LocalDate dataPowstania;

    public Sklep(HashMap<Produkt, Integer> produkty, Magazyn magazyn, String nazwaSklepu, LocalDate dataPowstania) {
        this.produkty = produkty;
        this.magazyn = magazyn;
        this.nazwaSklepu = nazwaSklepu;

        LocalDate today = LocalDate.now(ZoneId.of("Europe/Warsaw"));

        if (today.isBefore(dataPowstania)) {
            this.dataPowstania = dataPowstania;
        } else {
            throw new IllegalArgumentException("Data powstania nie może być z przeszłości");
        }
    }

    public void dodajProdukt(Produkt produkt, int ilosc) {
        produkty.put(produkt, ilosc);
    }

    public void wyswietlOferty() {
        for (Produkt produkt : produkty.keySet()) {
            produkt.wyswietlInformacje();
        }
    }

    public Produkt wyszukajProduktu(String nazwa) {
        for (Produkt produkt : produkty.keySet()) {
            if (produkt.getNazwa() == nazwa) {
                return produkt;
            }
        }
        return null;
    }

    public void zakupy(Produkt produkt, Klient klient) {
        produkty.remove(produkt);
    }

    public HashMap<Produkt, Integer> getProdukty() {
        return produkty;
    }

    public void setProdukty(HashMap<Produkt, Integer> produkty) {
        this.produkty = produkty;
    }

    public Magazyn getMagazyn() {
        return magazyn;
    }

    public void setMagazyn(Magazyn magazyn) {
        this.magazyn = magazyn;
    }

    public String getNazwaSklepu() {
        return nazwaSklepu;
    }

    public void setNazwaSklepu(String nazwaSklepu) {
        if(nazwaSklepu != null) {
            this.nazwaSklepu = nazwaSklepu;
        } else {
            throw new IllegalArgumentException("Nazwa sklepu nie może być nullem");
        }
    }

    public LocalDate getDataPowstania() {
        return dataPowstania;
    }

    public void setDataPowstania(LocalDate dataPowstania) {
        LocalDate today = LocalDate.now(ZoneId.of("Europe/Warsaw"));
        if (today.isBefore(dataPowstania)) {
            this.dataPowstania = dataPowstania;
        } else {
            throw new IllegalArgumentException("Data powstania nie może być z przeszłości");
        }
    }

    @Override
    public String toString() {
        return "Sklep{" +
                "produkty=" + produkty +
                ", magazyn=" + magazyn +
                ", nazwaSklepu='" + nazwaSklepu + '\'' +
                ", dataPowstania=" + dataPowstania +
                '}';
    }
}
