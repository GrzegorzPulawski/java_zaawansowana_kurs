package typy.generyczne.pair;

public class Main {
    public static void main(String[] args) {
        Pair<String> first = new Pair<String>("adam","3");
        Pair<Integer> second = new Pair<Integer>(2,4);
        System.out.println(first.getFirst());
        System.out.println(second.getSecond());
    }
}
