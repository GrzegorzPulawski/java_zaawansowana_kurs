package enumt.continent;

public enum Continent {
    //Stwórz klasę enum Continent, która będzie zawierać informację o nazwie
    // kontynentu oraz jego powierzchni (https://pl.wikipedia.org/wiki/Kontynent).
    //W ramach enuma zdeklaruj wszystkie kontynenty oraz metody statyczne do:
    //- zwracania największego kontynentu (skorzystaj z metody values())
    //- zwracania najmniejszego kontynentu (skorzystajc z metody values())
    AMERYKAPOLNOCNA("Ameryka Północna", 24.2),
    AMERYKAPOLUDNIOWA("Ameryka Południowa", 17.8),
    AFRYKA("Afryka", 30.4),
    EUROPA("Europa",10.2),
    AZJA("Azja",44.6),
    AUSTRALIA("Australia",7.7),
    ANTARKTYDA("Antarktyda",13.2);

    private String name;
    private double area;

    Continent(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public static Continent findTheBiggest(){
        Continent theBiggest = Continent.AZJA;
        for (Continent continent: Continent.values()){
            if(continent.getArea()> theBiggest.getArea()){
                theBiggest = continent;
            }
        }return theBiggest;
    }
    public static Continent findTheSmaller(){
        Continent theSmaller = Continent.AZJA;
        for (Continent continent : Continent.values()){
            if(continent.getArea() < theSmaller.getArea()){
                theSmaller = continent;
            }
        }return theSmaller;
    }
}
