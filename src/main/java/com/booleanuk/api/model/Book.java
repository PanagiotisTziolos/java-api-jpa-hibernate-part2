package com.booleanuk.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name="books")
public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name="title")
    private String title;

    @Column(name="genre")
    private String genre;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="author_id", nullable=false)
    @JsonIgnoreProperties({"books"})
    private Author author;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="publisher_id", nullable=false)
    @JsonIgnoreProperties({"books"})
    private Publisher publisher;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
