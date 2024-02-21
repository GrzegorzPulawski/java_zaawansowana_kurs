package nio.zadanie2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static nio.zadanie2.Main.Loader.load;

public class Main {
    public static void main(String[] args) {
        //Napisz Loader do plików csv.

        // załadowanych rekordów.
        String fileName ="C:\\Users\\szkol\\IdeaProjects\\Java_zaawansowana\\src\\main\\MojKatalog\\meaningful_data (1).csv";
        CSVData csvData = load(fileName);
        //informować o dostępnych kolumnach oraz ich liczbie,
        System.out.println("Dostępne kolumny");
        for (int i = 0; i < csvData.getColumnsSize(); i++) {
            System.out.println((i+1)+"."+"Dostępna kolumna o nazwie: " + csvData.getColumnsName(i));
        }
        System.out.println("Ilość kolumn: "+ csvData.getColumnsSize());
       // zwracać rekordy z ich wartościami i ilość
        for (String[] row : csvData.getRecords()){
            for (String cell : row ){
                System.out.print(cell +"\t");
            }
            System.out.println();
        }
    }
    public  class Loader{
        public static CSVData load(String fileName) {
            List<String> columns = new ArrayList<>();
            List<String[]> records = new ArrayList<>();

            try (BufferedReader buffer = new BufferedReader(new FileReader(fileName))) {
                String line;
                if ((line = buffer.readLine()) != null) {
                    columns.addAll(List.of(line.split(","))); // Dodaj kolumny do listy
                }
                while ((line = buffer.readLine()) != null) {
                    String[] row = line.split(","); // Rozdziel linię po przecinkach
                    records.add(row); // Dodaj wiersz do listy danych
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return new CSVData(columns, records);
        }
    }
}
