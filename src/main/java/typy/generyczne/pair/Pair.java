package typy.generyczne.pair;

public class Pair<T> {
    //Napisz klasę Pair, która będzie przyjmować dwa typy generyczne:
    //* typ first
    //* typ second
    //
    //Zaimplementuj metody:
    //* first() -> która zwróci nam wartość first
    //* second() -> która zwróci nam wartość second
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return this.first;
    }

    public T getSecond() {
        return this.second;
    }
}

