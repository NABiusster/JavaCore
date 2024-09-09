package HomeWork1;

public class Comment {
    // postId
    // id
    // name
    // email
    // body
    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;

    // Constructors
    //allArg
    public Comment(int postId, int id, String name, String email, String body) {
        this.postId = postId;
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }

    // Getters and Setters
    //postId
    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    //id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //body
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    //toString
    @Override
    public String toString() {
        return "\npostId =" + postId + " id = " + id + " name=" + name + " email=" + email + " body=" + body;
    }
}
