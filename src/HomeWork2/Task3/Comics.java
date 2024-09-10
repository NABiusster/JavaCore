package HomeWork2.Task3;

public class Comics extends Book {
    private String type;
    private String genre;

    //Constructor
    //NoArg
    public Comics() {
        super();
    }

    //AllArg
    public Comics(String title, int pages, String size, String type, String genre) {
        super(title, pages, size);
        this.type = type;
        this.genre = genre;
    }

    //Getters & Setters
    //type
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //Genre
    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "type='" + type + '\'' +
                ", genre='" + genre + '\'' +
                "} " + super.toString();
    }
}
