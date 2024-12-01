import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Produkt produkt = new Produkt("Szampon", 9.99, 100);

        produkt.dodajDoMagazynu(100);
        produkt.wyswietlInformacje();

        produkt.usunZMagazynu(150);
        produkt.wyswietlInformacje();

        produkt.usunZMagazynu(150);
        produkt.wyswietlInformacje();

        Produkt chleb = new Produkt("Chleb", 5.50, 100);
        Produkt maslo = new Produkt("Masło", 12.80, 100);
        ArrayList<Produkt> lista = new ArrayList<Produkt>();
        lista.add(chleb);
        lista.add(maslo);

        KoszykZakupowy koszyk = new KoszykZakupowy(lista);

        koszyk.dodajProdukt(new Produkt("Pomidor", 7.10, 100), 3);
        koszyk.wyswietlZawartoscKoszyka();
        System.out.println(koszyk.obliczCalkowitaWartosc());

        Zamowienie zamowienie = new Zamowienie(koszyk, "nowe");

        zamowienie.ustawStatusZamowienia("wysyłka");
        zamowienie.wyswietlZamowienie();

        ArrayList<Zamowienie> listaZamowien = new ArrayList<Zamowienie>();
        listaZamowien.add(zamowienie);

        Klient klient = new Klient("Marian", "Paździoch", listaZamowien);

        klient.wyswietlHistorieZamowien();
        System.out.println(klient.obliczLacznyKosztZamowien());

        Sklep sklep = new Sklep(lista);
        sklep.wyswietlOferty();

        Platnosc platnosc = new Platnosc(100, "Oczekująca");
        zamowienie.setPlatnosc(platnosc);

        zamowienie.finalizujZamowienie();
        zamowienie.wyswietlZamowienie();
    }
}