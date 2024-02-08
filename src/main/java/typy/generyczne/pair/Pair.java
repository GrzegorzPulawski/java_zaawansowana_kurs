package typy.generyczne.pair;

public class Pair<T, V> {
    //Napisz klasę Pair, która będzie przyjmować dwa typy generyczne:
    //* typ first
    //* typ second
    //
    //Zaimplementuj metody:
    //* first() -> która zwróci nam wartość first
    //* second() -> która zwróci nam wartość second
    private T first;
    private V second;

    public Pair(T first, V second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return this.first;
    }

    public V getSecond() {
        return this.second;
    }
}

