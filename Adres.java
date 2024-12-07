import java.util.Objects;

public class Adres {
    private String ulica;
    private String numerDomu;
    private String numerMieszkania = null;
    private String miasto;
    private int kodPocztowy;

    public Adres(String ulica, String numerDomu, String numerMieszkania, String miasto, int kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.numerMieszkania = numerMieszkania;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }

    public Adres(String ulica, String numerDomu, String miasto, int kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }

    public void pokaz() {
        System.out.println(this.kodPocztowy + " " + this.miasto);
        System.out.println(this.ulica + " " + this.numerDomu +  " " + this.numerMieszkania);
    }

    public boolean przed(Adres other) {
        if (this.kodPocztowy > other.kodPocztowy) {
            return true;
        } else {
            return false;
        }
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        if (ulica != null) {
            this.ulica = ulica;
        } else {
            throw new IllegalArgumentException("Ulica nie może być nullem");
        }
    }

    public String getNumerDomu() {
        return numerDomu;
    }

    public void setNumerDomu(String numerDomu) {
        if (numerDomu != null) {
            this.numerDomu = numerDomu;
        } else {
            throw new IllegalArgumentException("Numer domu nie może być nullem");
        }
    }

    public String getNumerMieszkania() {
        return numerMieszkania;
    }

    public void setNumerMieszkania(String numerMieszkania) {
        this.numerMieszkania = numerMieszkania;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        if (miasto != null) {
            this.miasto = miasto;
        } else {
            throw new IllegalArgumentException("Miasto nie może być nullem");
        }
    }

    public int getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(int kodPocztowy) {
        if (kodPocztowy > 10000 && kodPocztowy < 99999) {
            this.kodPocztowy = kodPocztowy;
        } else {
            throw new IllegalArgumentException("Kod pocztowy musi być z przedzialu 10-000 do 99-999");
        }
    }

    @Override
    public String toString() {
        return(this.kodPocztowy + " " + this.miasto + "\n" +
                this.ulica + " " + this.numerDomu +  " " + this.numerMieszkania);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Adres adres = (Adres) o;
        return kodPocztowy == adres.kodPocztowy && Objects.equals(ulica, adres.ulica) && Objects.equals(numerDomu, adres.numerDomu) && Objects.equals(numerMieszkania, adres.numerMieszkania) && Objects.equals(miasto, adres.miasto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ulica, numerDomu, numerMieszkania, miasto, kodPocztowy);
    }
}
