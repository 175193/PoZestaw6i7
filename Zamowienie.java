public class Zamowienie {
    private KoszykZakupowy koszyk;
    private String statusZamowienia;
    private Platnosc platnosc;

    public Zamowienie(KoszykZakupowy koszyk, String statusZamowienia) {
        this.koszyk = koszyk;
        this.statusZamowienia = statusZamowienia;
    }

    public void ustawStatusZamowienia(String statusZamowienia) {
        this.statusZamowienia = statusZamowienia;
    }

    public void wyswietlZamowienie() {
        koszyk.wyswietlZawartoscKoszyka();
        System.out.println("Status zamowienia - " + statusZamowienia);
        System.out.println("Wartość zamówienia - " + koszyk.obliczCalkowitaWartosc());
    }

    public KoszykZakupowy getKoszyk() {
        return koszyk;
    }

    public void finalizujZamowienie() {
        if (this.platnosc != null && this.platnosc.getStatusPlatnosci() == "Opłacono") {}
        this.platnosc.setStatusPlatnosci("Gotowe do wysyłki");
    }

    public void zwrocProdukt(Produkt produkt, int ile) {
        produkt.dodajDoMagazynu(ile);
        this.statusZamowienia = "Zwrócono";
    }

    public void setPlatnosc(Platnosc platnosc) {
        this.platnosc = platnosc;
    }
}
