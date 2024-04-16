package Lesson1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Cars
        System.out.println("===== Cars =====");
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            cars.add(new Car("model" + i, i * 10, "engine" + i, i % 2 == 0));
        }
        for (Car car : cars) {
            System.out.println(car);
        }
        //Books
        System.out.println("===== Books =====");
        ArrayList<Book> books = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            Book book = new Book("Title" + i, i * 10, "genre" + i);
            for (int j = 0; j < i; j++) {
                book.setAuthor("Author" + j);
            }
            books.add(book);
        }
        for (Book book : books) {
            System.out.println(book);
        }
        //Dogs
        System.out.println("===== Dogs =====");
        ArrayList<Dog> dogs = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            dogs.add(new Dog(i, "Lesson1.Dog" + i, "poroda" + i));
        }
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
        System.out.println("===== Posts =====");
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post(1, 1, "sunt aut facere repellat provident occaecati excepturi optio reprehenderit", "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"));
        posts.add(new Post(1, 2, "qui est esse", "est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla"));
        posts.add(new Post(1, 3, "ea molestias quasi exercitationem repellat qui ipsa sit aut", "et iusto sed quo iure\nvoluptatem occaecati omnis eligendi aut ad\nvoluptatem doloribus vel accusantium quis pariatur\nmolestiae porro eius odio et labore et velit aut"));
        posts.add(new Post(1, 4, "eum et est occaecati", "ullam et saepe reiciendis voluptatem adipisci\nsit amet autem assumenda provident rerum culpa\nquis hic commodi nesciunt rem tenetur doloremque ipsam iure\nquis sunt voluptatem rerum illo velit"));
        posts.add(new Post(1, 5, "nesciunt quas odio", "repudiandae veniam quaerat sunt sed\nalias aut fugiat sit autem sed est\nvoluptatem omnis possimus esse voluptatibus quis\nest aut tenetur dolor neque"));
        for (Post post : posts) {
            System.out.println(post);
        }
        System.out.println("===== Comments =====");
        ArrayList<Comment> comments = new ArrayList<>();
        comments.add(new Comment(1, 1, "id labore ex et quam laborum", "Eliseo@gardner.biz", "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"));
        comments.add(new Comment(1, 2, "quo vero reiciendis velit similique earum", "Jayne_Kuhic@sydney.com", "est natus enim nihil est dolore omnis voluptatem numquam\net omnis occaecati quod ullam at\nvoluptatem error expedita pariatur\nnihil sint nostrum voluptatem reiciendis et"));
        comments.add(new Comment(1, 3, "odio adipisci rerum aut animi", "Nikita@garfield.biz", "quia molestiae reprehenderit quasi aspernatur\naut expedita occaecati aliquam eveniet laudantium\nomnis quibusdam delectus saepe quia accusamus maiores nam est\ncum et ducimus et vero voluptates excepturi deleniti ratione"));
        comments.add(new Comment(1, 4, "alias odio sit", "Lew@alysha.tv", "non et atque\noccaecati deserunt quas accusantium unde odit nobis qui voluptatem\nquia voluptas consequuntur itaque dolor\net qui rerum deleniti ut occaecati"));
        comments.add(new Comment(1, 5, "vero eaque aliquid doloribus et culpa", "Hayden@althea.biz", "harum non quasi et ratione\ntempore iure ex voluptates in ratione\nharum architecto fugit inventore cupiditate\nvoluptates magni quo et"));
        for (Comment comment : comments) {
            System.out.println(comment);
        }
    }
}