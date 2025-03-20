package src.day05_oop.moviesys;

public class Movie {

    private int id;
    private String filmName;
    private String actor;
    private double price;

    public Movie() {
    }

    public Movie(int id, String filmName, String actor, double price) {
        this.id = id;
        this.filmName = filmName;
        this.actor = actor;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
