import java.util.Objects;

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
        System.out.println("Nazwa: " + this.nazwa);
        System.out.println("Cena: " + this.cena);
        System.out.println("Ilość na magaznie: " + this.iloscNaMagazynie);
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

    public void setNazwa(String nazwa) {
        if (nazwa != null) {
            this.nazwa = nazwa;
        } else {
            throw new IllegalArgumentException("Nazwa nie może być nullem");
        }
    }

    public void setCena(double cena) {
        if (cena > 0) {
            this.cena = cena;
        }  else {
            throw new IllegalArgumentException("Cena nie może być mniejsza od zera");
        }
    }

    public void setIloscNaMagazynie(int iloscNaMagazynie) {
        if (iloscNaMagazynie > 0) {
            this.iloscNaMagazynie = iloscNaMagazynie;
        }  else {
            throw new IllegalArgumentException("Ilosc Na Magazynie nie może być mniejsza od zera");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Produkt produkt = (Produkt) o;
        return Double.compare(cena, produkt.cena) == 0 && Objects.equals(nazwa, produkt.nazwa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, cena);
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", iloscNaMagazynie=" + iloscNaMagazynie +
                '}';
    }
}
