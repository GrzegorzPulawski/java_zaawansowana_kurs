package stream.zadanie1;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class Movie {
    private String title;
    private String type;
    private long duration;//min
    private LocalDate releaseDate;

    public Movie(String title, String type, long duration, LocalDate releaseDate) {
        this.title = title;
        this.type = type;
        this.duration = duration;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", duration=" + duration +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
