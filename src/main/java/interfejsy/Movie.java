package interfejsy;

public class Movie {
    //  //Stwórz klasę movie z polami:
    //    //- title
    //    //- yearOfRelease
    //oraz zaimplementuj wymagane metody.
    private String title;
    private int yearOfRelease;

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }

    public Movie(String title, int yearOfRelease) {
        this.title = title;
        this.yearOfRelease = yearOfRelease;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
}
