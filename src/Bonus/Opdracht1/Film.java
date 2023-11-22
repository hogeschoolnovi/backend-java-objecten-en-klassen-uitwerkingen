package Bonus.Opdracht1;


import java.time.LocalDate;

public class Film {
    private String title;
    private String director;
    private LocalDate releasedate;
    private String genre;

    public Film(String title, String director, LocalDate releaseDate, String genre) {
        this.title = title;
        this.director = director;
        this.releasedate = releaseDate;
        this.genre = genre;
    }

    public void getInfo(){
        String info = "Film: " + title +
                "\nRegisseur: " + director +
                "\nGenre: " + genre +
                "\nReleaseDate: " + releasedate;
        System.out.println(info);
    }
}
