package bookstore.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bookstore.models.Book;
import bookstore.services.BaseDao;

/*
 * repository: query yang berhubungan dengan data db
 */

public class BookDao implements BaseDao<Book,Integer> {

    List<Book>books = new ArrayList<>(Arrays.asList(
    new Book("Buku1","Deskripsi Buku 1", "Pengarang buku 1"),
    new Book("Buku1","Deskripsi Buku 1", "Pengarang buku 1")
    ));

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        books.remove(id - 1);
        
    }

    @Override
    public List<Book> findAll() {
        // TODO Auto-generated method stub
        return books;
    }

    @Override
    public Book findById(Integer id) {
        // TODO Auto-generated method stub
        return books.get(id - 1);
    }

    @Override
    public void save(Book data) {
        // TODO Auto-generated method stub
        books.add(data);
        
    }

    @Override
    public void update(Integer id, Book data) {
        // TODO Auto-generated method stub
        books.set(id - 1, data);
        
    }
    
}
