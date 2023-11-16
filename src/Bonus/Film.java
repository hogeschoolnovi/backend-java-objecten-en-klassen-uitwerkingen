package Bonus;


import java.time.LocalDate;

public class Film {
    private String title;
    private String director;
    private LocalDate releasedate;
    private String genre;

    public Film(String titel, String regisseur, LocalDate releasedatum, String genre) {
        this.title = titel;
        this.director = regisseur;
        this.releasedate = releasedatum;
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
