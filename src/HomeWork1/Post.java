package HomeWork1;

public class Post {
    //userId
    //id
    //title
    //body
    private int userId;
    private int id;
    private String title;
    private String body;

    // Constructors
    //noArg
    public Post() {};
    //allArg
    public Post(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    // Getters and Setters
    //userId
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    //id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //title
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    //body
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    //to string

    @Override
    public String toString() {
        return "\nUserId=" + userId + ", Id=" + id + ", Title=" + title + ", Body=" + body;
    }
}
