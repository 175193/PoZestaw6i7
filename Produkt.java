public class Produkt {
    private String nazwa;
    private double cena;
    private int iloscNaMagazynie;

    public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    public void wyswietlInformacje() {
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Cena: " + cena);
        System.out.println("Ilość na magaznie: " + iloscNaMagazynie);
    }

    public void dodajDoMagazynu(int ile) {
        this.iloscNaMagazynie += ile;
    }

    public void usunZMagazynu(int ile) {
        if (this.iloscNaMagazynie >= ile) {
            this.iloscNaMagazynie -= ile;
        }
    }

    public int getIloscNaMagazynie() {
        return iloscNaMagazynie;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }
}
