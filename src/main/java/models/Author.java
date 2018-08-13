package models;

import javax.persistence.*;

@Entity
@Table(name="authors")

public class Author {

    private int id;
    private String firstName;
    private String lastName;
    private String title;

    public Author() {

    }

    public Author(String firstName, String lastName, String title) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle() {
        this.title = title;
    }

}

