import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Produkt chleb = new Produkt("Chleb", 5.50, 100);
        Produkt maslo = new Produkt("Masło", 12.80, 100);
        HashMap<Produkt, Integer> lista = new HashMap<>();
        lista.put(chleb, 1);
        lista.put(maslo, 1);

        KoszykZakupowy koszyk = new KoszykZakupowy(lista);
        koszyk.dodajProdukt(new Produkt("Pomidor", 7.10, 100), 3);
        System.out.println(koszyk);

        Zamowienie zamowienie = new Zamowienie(koszyk, "nowe");
        zamowienie.ustawStatusZamowienia("wysyłka");
        System.out.println(zamowienie);

        ArrayList<Zamowienie> listaZamowien = new ArrayList<Zamowienie>();
        listaZamowien.add(zamowienie);

        Klient klient = new Klient("Marian", "Paździoch", listaZamowien);

        System.out.println(klient);
        klient.wyswietlHistorieZamowien();

        Magazyn magazyn = new Magazyn(lista);
        System.out.println(magazyn);

        Sklep sklep = new Sklep(lista, magazyn, "FrogShop", LocalDate.of(2002, 3, 15));
        System.out.println(sklep);

        Platnosc platnosc = new Platnosc(100, "Oczekująca");
        zamowienie.setPlatnosc(platnosc);
        zamowienie.finalizujZamowienie();
        System.out.println(zamowienie);
    }
}