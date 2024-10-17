package zad1;

public class Book {
    String title;
    String author;
    int publicationYear;

    public Book(){

    }
    public Book(String title, String author, int publicationYear){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Diuna";
        b1.author = "Frank Herbert";
        b1.publicationYear = 2024;
        Book b2 = new Book("Diuna","Frank Herbert",2024);
        System.out.println(b1.title);
    }
}
