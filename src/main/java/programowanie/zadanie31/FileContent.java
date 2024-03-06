package programowanie.zadanie31;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileContent {
    public static void main(String[] args) {
        String inputFilePath = "input.txt"; // Ścieżka do pliku wejściowego
        String outputFilePath = "output.txt"; // Ścieżka do pliku wyjściowego

        try {
            // Odczytanie wszystkich linii pliku wejściowego
            Path inputPath = Paths.get(inputFilePath);
            List<String> lines = Files.readAllLines(inputPath);

            // Odwrócenie kolejności linii
            StringBuilder reversedContent = new StringBuilder();
            for (int i = lines.size() - 1; i >= 0; i--) {
                reversedContent.append(lines.get(i)).append(System.lineSeparator());
            }

            // Zapisanie odwróconej zawartości do pliku wyjściowego
            Path outputPath = Paths.get(outputFilePath);
            Files.write(outputPath, reversedContent.toString().getBytes());

            System.out.println("Zawartość pliku została odwrócona i zapisana w pliku: " + outputPath.toAbsolutePath());
        } catch (IOException e) {
            System.err.println("Wystąpił błąd podczas operacji na plikach: " + e.getMessage());
        }
    }
}

