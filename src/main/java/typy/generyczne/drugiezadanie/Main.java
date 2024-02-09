package typy.generyczne.drugiezadanie;

public class Main {
    public static void main(String[] args) {

        //Napisz metodę generyczną, które zadaniem będzie zamiana (swap) elementów o wskazanych pozycjach w tablicy.
        //Metoda powinna przyjmować:
        //- tablicę dowolnego typu elementów
        //- pozycję pierwszego elementu
        //- pozycję drugiego elementu
        //tzn, np. jeśli mamy tablice 10 elementów, podamy pozycję 1: 4, pozycję 2: 8 to należy dokonać zamiany:
        //- element pod indeksem 4 musi znaleść się pod indeksem 8, a element o indeksie 8 musi znaleść się pod indeksem 4
        Swap<String> swap1 = new Swap<>();
        String[] array = {"kasia", "basia", "ola"};
        swap1.swapArray(array, 0, 2);
        swap1.printArray(array);
    }
}

