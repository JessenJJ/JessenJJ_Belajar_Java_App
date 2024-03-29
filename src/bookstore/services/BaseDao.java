package bookstore.services;

import java.util.List;

// generic class: class yang mempunyai tipe data general

public interface BaseDao<E, ID> {
    // tipe data dari data-nya itu misal dari book atau yang lain
    void save(E data);

    List<E>findAll();

    E findById(ID id);

    void update(ID id, E data);

    void delete(ID id);
} 