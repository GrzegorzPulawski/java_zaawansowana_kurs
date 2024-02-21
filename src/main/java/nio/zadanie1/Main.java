package nio.zadanie1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Main { //Napisz kod który stworzy plik i wpisze do niego 500 losowych liczb z przedziału 999-999.999.
    // Następnie wczytaj ten plik, znajdź nieparzyste liczby i wpisz je do nowego pliku.
    //
    //Podpowiedz:
    //obiekt Random i jego nextInt funkcja pozwala na generowanie losowych wartości z przedziału;
    //możesz skorzystać ze streamów ale nie musisz;

    public static void main(String[] args) throws IOException {
        Path sciezka = Path.of("C:\\Users\\szkol\\IdeaProjects\\Java_zaawansowana\\src\\main\\MojKatalog\\dataNumer1");
        Path sciezka2 = Path.of("C:\\Users\\szkol\\IdeaProjects\\Java_zaawansowana\\src\\main\\MojKatalog\\dataNumber2");
        Files.deleteIfExists(sciezka);
        Files.createFile(sciezka);
        writeToFile(sciezka);

        Files.deleteIfExists(sciezka2);
        Files.createFile(sciezka2);
        findEvenNumbers(sciezka, sciezka2);


    }

    private static void writeToFile(Path sciezka) {
        try {
            Random random = new Random();
            for (int i = 0; i < 500; i++) {
                int number = random.nextInt(999999) + 999;
                Files.write(sciezka, ("" + number + "\n").getBytes(), StandardOpenOption.APPEND);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private static void findEvenNumbers(Path sciezka1, Path sciezka2) {
        try {

            Files.readAllLines(sciezka1).stream().mapToInt(i -> Integer.valueOf(i))
                    .filter(s -> s % 2 == 1).forEach(element -> {
                        writeToFileResult(sciezka2, element);
                    });

        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    private static void writeToFileResult(Path sciezka, int element) {
        try {
            Files.write(sciezka, ("" + element + "\n").getBytes(), StandardOpenOption.APPEND);

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}