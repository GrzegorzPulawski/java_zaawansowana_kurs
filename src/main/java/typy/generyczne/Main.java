package typy.generyczne;

public class Main {


    public static void main(String[] args) {
        String moj_klucz_ssh = "xxxxxxxxx";
        Sejf<String> tajnyObiekt = new Sejf<String>("tajnehaslo", moj_klucz_ssh);

        String obiekt = tajnyObiekt.getObject("tajnehaslo");

        Sejf<Integer> tajnyObiekt2 = new Sejf<>("tajnehaslo222", 12);


        Sejf<String> tajny2 = tajnyObiekt;
    }
}
