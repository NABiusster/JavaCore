package HomeWork2.Task3;

public class Main {
    public static void main(String[] args) {
        Book book = new Book(
                "It Ends with Us",
                368,
                "135x205"
        );
        Comics comics = new Comics(
                "BIKER MICE FROM MARS #2 CVR A WEAVER",
                32,
                "170x260",
                "Zeszyt",
                "Fantastic"
        );
        Journal journal = new Journal(
                "Forbes Ukraine",
                24,
                "205х265",
                "Month",
                "paper"
        );
        System.out.println(book);
        System.out.println(comics);
        System.out.println(journal);
    }

}