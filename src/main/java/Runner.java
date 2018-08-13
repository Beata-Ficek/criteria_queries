import db.DBAuthor;
import models.Author;

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
    }


}
