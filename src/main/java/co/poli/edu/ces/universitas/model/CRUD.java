package co.poli.edu.ces.universitas.model;

import co.poli.edu.ces.universitas.dto.DtoBook;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CRUD {
    Book create(DtoBook book) throws SQLException;

    public ArrayList<Book> all();

    public Book findById(int id) throws SQLException;

    Book update(Book book) throws SQLException;

    void delete(int bookId) throws SQLException;
}