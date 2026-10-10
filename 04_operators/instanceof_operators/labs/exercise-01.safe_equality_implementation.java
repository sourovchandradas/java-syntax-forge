// Exercise 01: Safe Equality Implementation

public class Book {
    private String title;
    private int isbn;

    public Book(String title, int isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book other)) return false;
        return this.isbn == other.isbn;
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Guide", 101);
        Book b2 = new Book("Java Guide", 101);
        System.out.println("Books Equal: " + b1.equals(b2)); // Output: true
    }
}
