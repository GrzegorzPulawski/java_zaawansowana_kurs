package typy.generyczne.pair;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> first = new Pair<String, Integer>("adam",3);
        Pair<Integer, String> second = new Pair<Integer, String>(2,"Kasia");
        System.out.println(first.getFirst());
        System.out.println(second.getSecond());
    }
}
