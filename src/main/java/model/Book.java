package model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private int id;
    @Column(name = "name")
    private String name;
    @ManyToOne
    @JoinColumn(name="author_id")
    private Authors author_id;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="genre_id")
    private List<Genre> genre_id;
    @Column(name = "year")
    private int year;
    @Column(name = "countOfBooks")
    private int countOfBooks;

    public Book() {
    }



    public Book(String name, Authors author_id, List genre_id, int year, int countOfBooks) {
        this.name = name;
        this.author_id = author_id;
        this.genre_id = genre_id;
        this.year = year;
        this.countOfBooks = countOfBooks;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author_id='" + author_id + '\'' +
                ", genre_id=" + genre_id +
                ", year=" + year +
                ", countOfBooks=" + countOfBooks +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && genre_id == book.genre_id && year == book.year && countOfBooks == book.countOfBooks && Objects.equals(name, book.name) && Objects.equals(author_id, book.author_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, author_id, genre_id, year, countOfBooks);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCountOfBooks(int countOfBooks) {
        this.countOfBooks = countOfBooks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getCountOfBooks() {
        return countOfBooks;
    }
    public Authors getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Authors author_id) {
        this.author_id = author_id;
    }

    public List<Genre> getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(List<Genre> genre_id) {
        this.genre_id = genre_id;
    }
}
