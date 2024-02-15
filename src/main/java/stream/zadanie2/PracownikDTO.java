package stream.zadanie2;

import java.math.BigDecimal;

public class PracownikDTO {
    private int id;
    private String imie;
    private String nazwisko;
    private int wiek;
    private DzialEnum dzial;
    BigDecimal salary;

    public PracownikDTO(int id, String imie, String nazwisko, int wiek, DzialEnum dzial, BigDecimal salary) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.dzial = dzial;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public DzialEnum getDzial() {
        return dzial;
    }

    public void setDzial(DzialEnum dzial) {
        this.dzial = dzial;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "PracownikDTO{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", dzial=" + dzial +
                ", salary=" + salary +
                '}';
    }
}
