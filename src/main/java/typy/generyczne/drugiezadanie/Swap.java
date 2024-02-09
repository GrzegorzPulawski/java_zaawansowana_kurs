package typy.generyczne.drugiezadanie;

public class Swap<T> {
    //Napisz metodę generyczną, które zadaniem będzie zamiana (swap) elementów o wskazanych pozycjach w tablicy.
    //Metoda powinna przyjmować:
    //- tablicę dowolnego typu elementów
    //- pozycję pierwszego elementu
    //- pozycję drugiego elementu
    //tzn, np. jeśli mamy tablice 10 elementów, podamy pozycję 1: 4, pozycję 2: 8 to należy dokonać zamiany:
    //- element pod indeksem 4 musi znaleść się pod indeksem 8, a element o indeksie 8 musi znaleść się pod indeksem 4
    private T[] array;

    public Swap() {

    }

    public T[] getArray() {
        return array;
    }

    public T[] swapArray(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return array;
    }

    public void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
