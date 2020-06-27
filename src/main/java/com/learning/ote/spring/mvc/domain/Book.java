package com.learning.ote.spring.mvc.domain;

import com.learning.ote.spring.enums.Category;

import javax.persistence.*;

@Entity
@Table(name = "BOOK")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long id;

    @Column(name = "book_title", nullable = false)
    private String title;

    @Column(name = "publication_year")
    private String year;

    @ManyToOne(optional = false, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "author_id")
    private Author author;

    @Enumerated(EnumType.STRING)
    @Column(name = "book_category")
    private Category category;

    public Book(String title, String year, Author author, Category category) {
        this.title = title;
        this.year = year;
        this.author = author;
        this.category = category;
    }

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
