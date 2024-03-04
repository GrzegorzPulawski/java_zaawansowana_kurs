package programowanie.zadanie12;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    //Stwórz klasę CarService, która będzie zawierać w sobie listę aut, oraz będzie realizować poniższe metody:


    //zwracanie listy wszystkich aut posortowanych zgodnie z przekazanym parametrem: rosnąco/malejąco,
    //sprawdzanie czy konkretne auto znajduje się na liście,
    //zwracanie listy aut wyprodukowanych przez konkretnego producenta,
    //zwracanie listy aut wyprodukowanych przez producenta z rokiem założenia <,>,<=,>=,=,!= od podanego.
    private List<Car> carList;
    //dodawanie aut do listy,
    public List<Car> addCar(Car car) {
        this.carList.add(car);
        return carList;
    }
    //usuwanie auta z listy,
    public  List<Car> removeCar(Car car){
        this.carList.remove(car);
        return carList;
    }
    //zwracanie listy wszystkich aut,
    public List<Car> getAll(){
        return this.carList;
    }
    //zwracanie aut z silnikiem V12,
    public List<Car> getCarV12(){
        return carList.stream().filter(element -> element.getEngineType().equals(EngineType.V12)).collect(Collectors.toList());
    }
    //zwracanie aut wyprodukowanych przed rokiem 1999,
    public List<Car> getCarBefor1999(){
        return carList.stream().filter(element -> element.getRokProdukcji().equals("1999")).collect(Collectors.toList());
    }
    //zwracanie najdroższego auta,
    public Car getTheMoreExpansive(){
        return carList.stream().max(Comparator.comparing(Car::getCena)).orElse(null);
    }
    //zwracanie najtańszego auta,
    public Car getTheCheapest(){
        return carList.stream().min(Comparator.comparing((Car::getCena))).orElse(null);
    }
    //zwracanie auta z co najmniej 3 producentami,
}


