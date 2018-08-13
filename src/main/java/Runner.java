import db.DBAuthor;
import db.DBBook;
import models.Author;
import models.Book;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Author author1 = new Author("Ryszard", "Kapuscinski", "Heban");
        DBAuthor.save(author1);
        Author author2 = new Author("Ryszard", "Kapuscinski", "Cesarz");
        DBAuthor.save(author2);
        Author author3 = new Author("Michal", "Szafranski", "Finansowy Ninja");
        DBAuthor.save(author3);

        List<Author> authors = DBAuthor.getAll();

        Author foundAuthor = DBAuthor.findById(3);

        Book book1 = new Book("Terry Pratchett", "Blask Fantastyczny");
        DBBook.save(book1);
        Book book2 = new Book("Tim Marshall", "Prisoners of Geography");
        DBBook.save(book2);
        Book book3 = new Book("Neil Gaiman", "American Gods");
        DBBook.save(book3);

        List<Book> books = DBBook.getAll();

        Book foundBook = DBBook.findById(1);
    }


}
