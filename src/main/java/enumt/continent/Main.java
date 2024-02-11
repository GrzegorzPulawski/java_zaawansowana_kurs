package enumt.continent;

public class Main {
    public static void main(String[] args) {
        Continent theBiggest = Continent.findTheBiggest();
        System.out.println(theBiggest.getName());

        Continent theSmaller = Continent.findTheSmaller();
        System.out.println(theSmaller.getName());
    }
}
