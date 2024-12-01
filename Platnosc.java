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
        this.statusPlatnosci = statusPlatnosci;
    }

    public String getStatusPlatnosci() {
        return statusPlatnosci;
    }
}
