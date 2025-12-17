class Book {
    String name, author;
    double price;
    int num_pages;

    Book(String n, String a, double p, int pages) {
        name = n;
        author = a;
        price = p;
        num_pages = pages;
    }

    public String toString() {
        return "Book: " + name + ", Author: " + author +
               ", Price: " + price + ", Pages: " + num_pages;
    }
}

public class BookMain {
    public static void main(String[] args) {
        Book[] b = new Book[2];
        b[0] = new Book("Java", "James", 450, 500);
        b[1] = new Book("Python", "Guido", 400, 350);

        for (Book book : b)
            System.out.println(book);
    }
}
