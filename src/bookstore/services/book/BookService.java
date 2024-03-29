package bookstore.services.book;

import java.util.List;

import bookstore.models.Book;

public interface BookService {
 
    // CRUD
    void createBook(Book book);

    List<Book>showBooks();

    List<Book>showByID();


    
}
