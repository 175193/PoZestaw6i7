import java.util.Objects;

public class Platnosc {
    private double kwota;
    private String statusPlatnosci;

    public Platnosc(double kwota, String statusPlatnosci) {
        this.kwota = kwota;
        this.statusPlatnosci = statusPlatnosci;
    }

    public void zaplac() {
        this.statusPlatnosci = "Opłacone";
    }

    public void setStatusPlatnosci(String statusPlatnosci) {
        if (statusPlatnosci != null) {
            this.statusPlatnosci = statusPlatnosci;
        } else {
            throw new IllegalArgumentException("Status płatności nie może być nullem");
        }
    }

    public String getStatusPlatnosci() {
        return statusPlatnosci;
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        if (kwota < 0 ) {
            this.kwota = kwota;
        } else {
            throw new IllegalArgumentException("Kwota nie może być mniejsza od zera");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Platnosc platnosc = (Platnosc) o;
        return Double.compare(kwota, platnosc.kwota) == 0 && Objects.equals(statusPlatnosci, platnosc.statusPlatnosci);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kwota, statusPlatnosci);
    }

    @Override
    public String toString() {
        return "Platnosc{" +
                "kwota=" + kwota +
                ", statusPlatnosci='" + statusPlatnosci + '\'' +
                '}';
    }
}
