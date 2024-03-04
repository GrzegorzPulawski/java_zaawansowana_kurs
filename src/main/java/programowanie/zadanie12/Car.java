package programowanie.zadanie12;

import java.util.List;
import java.util.Objects;

public class Car {
    //Stwórz klasę Car, która będzie zawierać pola: nazwa, model, cena, rok produkcji, lista producentów (Manufacturer),
    // oraz typ silnika (reprezentowany jako klasa enum, np. V12, V8, V6, S6, S4, S3). Uwzględnij wszystkie niezbędne metody oraz parametry konstruktora.
    // Zaimplementuj metody hashcode() i equals().
    private String nazwa;
    private String model;
    private int cena;
    private String rokProdukcji;
    private List<Manufacturer> manufacturerList;
    private EngineType engineType;

    public Car(String nazwa, String model, int cena, String rokProdukcji, List<Manufacturer> manufacturerList, EngineType engineType) {
        this.nazwa = nazwa;
        this.model = model;
        this.cena = cena;
        this.rokProdukcji = rokProdukcji;
        this.manufacturerList = manufacturerList;
        this.engineType = engineType;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(String rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public List<Manufacturer> getManufacturerList() {
        return manufacturerList;
    }

    public void setManufacturerList(List<Manufacturer> manufacturerList) {
        this.manufacturerList = manufacturerList;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return getCena() == car.getCena() && getNazwa().equals(car.getNazwa()) && getModel().equals(car.getModel()) && getRokProdukcji().equals(car.getRokProdukcji()) && getManufacturerList().equals(car.getManufacturerList()) && getEngineType() == car.getEngineType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNazwa(), getModel(), getCena(), getRokProdukcji(), getManufacturerList(), getEngineType());
    }
}
