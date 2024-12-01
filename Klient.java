import java.util.ArrayList;

public class Klient {
    private String imie;
    private String nazwisko;
    private ArrayList<Zamowienie> listaZamowien;

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
}
