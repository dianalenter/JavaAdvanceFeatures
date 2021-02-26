package oop.tema.exception.task2bookrepositoryclass;

/**
 * 1.BookRepository class
 * Create the BookRepository class, which will be responsible for:
 * adding Book objects
 * removing Book objects
 * searching for objects of the Book type with the indicated name
 * searching for objects of the Book type with the indicated id
 * removing objects of the Book type based on the provided id
 *2. Book class
 * The Book class should include the following elds:
 * id
 * title
 * author
 * year of release
 *3. NoBookFoundException
 * In case of lack of searched results an exception should be thrown. This
 * exception should accept the String parameter object with information about
 * which elements could not be found.
 */

public class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title,String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getId() {
        return isbn;
    }

    public void setIsbn(String id) {
        this.isbn = id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }





}
