import java.util.ArrayList;
import java.util.Objects;

public class Klient {
    private String imie;
    private String nazwisko;
    private ArrayList<Zamowienie> listaZamowien;
    private Adres adres;

    public Klient(String imie, String nazwisko, ArrayList<Zamowienie> listaZamowien) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaZamowien = listaZamowien;
    }

    public void dodajZamowienie(Zamowienie z) {
        listaZamowien.add(z);
    }

    public void wyswietlHistorieZamowien() {
        for (Zamowienie z : listaZamowien) {
            z.wyswietlZamowienie();
        }
    }

    public double obliczLacznyKosztZamowien() {
        double sum = 0;

        for (Zamowienie z : listaZamowien) {
            sum += z.getKoszyk().obliczCalkowitaWartosc();
        }

        return sum;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        if (imie != null) {
            this.imie = imie;
        } else {
            throw new IllegalArgumentException("Imie nie może być nullem");
        }
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        if (nazwisko != null) {
            this.nazwisko = nazwisko;
        } else {
            throw new IllegalArgumentException("Nazwisko nie może być nullem");
        }
    }

    public ArrayList<Zamowienie> getListaZamowien() {
        return listaZamowien;
    }

    public void setListaZamowien(ArrayList<Zamowienie> listaZamowien) {
        this.listaZamowien = listaZamowien;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Klient klient = (Klient) o;
        return Objects.equals(imie, klient.imie) && Objects.equals(nazwisko, klient.nazwisko) && Objects.equals(adres, klient.adres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, adres);
    }

    @Override
    public String toString() {
        return "Klient{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", adres=" + adres +
                '}';
    }
}
