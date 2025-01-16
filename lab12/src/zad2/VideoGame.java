package zad2;

import java.time.LocalDate;

public class VideoGame implements Cloneable{
    String title;
    String genre;
    LocalDate releaseDate;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public VideoGame(String title, String genre, LocalDate releaseDate) {
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
