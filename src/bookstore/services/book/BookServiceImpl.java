package bookstore.services.book;

import java.util.List;

import bookstore.dao.BookDao;
import bookstore.models.Book;

public class BookServiceImpl implements BookService {
    BookDao bdrepo;

    public BookServiceImpl(BookDao bdrepo) {
        this.bdrepo = bdrepo;
    }

    public BookServiceImpl() {
    }

    @Override
    public void createBook(Book book) {
        // TODO Auto-generated method stub
        // req book, akan disimpan pakai method savenya dao

        // tambahkan exception
        this.bdrepo.save(book);
        System.out.println("book is added");
    }

    @Override
    public List<Book> showBooks() {
        return this.bdrepo.findAll();
    }

    @Override
    public List<Book> showByID() {
        for(int i = 0; bdrepo.length; i++)
        if(List<Book> == null){
            throw new UnsupportedOperationException("Unimplemented method 'showByID'");
        }
        return (List<Book>) this.bdrepo.findById(null)

    }
    
}
