package models;

import javax.persistence.*;

@Entity
@Table(name="books")

public class Book {

        private int id;
        private String author;
        private String title;

        public Book() {
        }

        public Book(String author, String title) {
            this.author = author;
            this.title = title;
        }

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Column(name = "author")
        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        @Column(name = "title")
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

    }
