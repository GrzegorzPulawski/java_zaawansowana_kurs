package equals.zadanie1;

public class Nowa {
    private String title;
    private String director;
    private int yearOfPublishing;

    public Nowa(String title, String director, int yearOfPublishing) {
        this.title = title;
        this.director = director;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }
    @Override
    public boolean equals(Object o) { // na moich zasadach co musi zajść aby 2 obiekty były sobie równe
        return this.title == ((Nowa) o).title;
    }

    @Override
    public int hashCode() { // reprezentacja liczbowa obiektu - hash, zazwyczaj budowany ze wszystkich pól
        return this.title.hashCode();
    }


}
