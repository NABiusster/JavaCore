package HomeWork1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Books
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<String> authors = new ArrayList<>();
        authors.add("Author1");
        authors.add("Author2");

        //allArg Authors = array
        for (int i = 1; i < 3; i++) {
            books.add(new Book("Title" + i,
                    i * 100,
                    authors,
                    "genre" + i));
        }
        //allArg Author = String
        Book book3 = new Book("Title3", 300, "Author3", "Genre3");
        books.add(book3);

        //noArg authors = array
        Book book4 = new Book();
        book4.setTitle("Title4");
        book4.setPages(400);
        book4.setAuthors(authors);
        book4.setGenre("genre4");
        books.add(book4);

        //noArg author = String
        Book book5 = new Book();
        book5.setTitle("Title5");
        book5.setPages(500);
        book5.addAuthor("Author5");
        book5.setGenre("genre5");
        books.add(book5);

        System.out.println("=== === Books === ===");
        System.out.println(books);

        //Cars
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            Car car = new Car("Model" + i, i * 1000, "VolumeEngine" + i, i % 2 == 0);
            cars.add(car);
        }
        System.out.println("=== === Cars === ===");
        System.out.println(cars);

        //Dogs
        ArrayList<Dog> dogs = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            Dog dog = new Dog("Name" + i, i, "Breed" + i);
            dogs.add(dog);
        }
        System.out.println("=== === Dogs === ===");
        System.out.println(dogs);

        //posts
        ArrayList<Post> posts = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            Post post = new Post(i, i, "Title" + i, "Body");
            posts.add(post);
        }
        System.out.println("=== === Posts === ===");
        System.out.println(posts);

        //comments
        ArrayList<Comment> comments = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            Comment comment = new Comment(i, i, "Name" + i, "Author" + i, "Body");
            comments.add(comment);
        }
        System.out.println("=== === Comments === ===");
        System.out.println(comments);
    }

}