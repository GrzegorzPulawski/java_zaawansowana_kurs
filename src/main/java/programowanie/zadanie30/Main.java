package programowanie.zadanie30;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String outputFile = "src/main/MojKatalog/Ala_czysta.txt";
        Path inputPath = Path.of("src/main/MojKatalog/Ala_ma_kota.txt");
        List<String> lines = Files.readAllLines(inputPath);

        List<String> reverseLines = new ArrayList<>(lines);
        Collections.reverse(reverseLines);

        Path outputPath = Paths.get(outputFile);

        Files.write(outputPath, reverseLines);

    }
}
