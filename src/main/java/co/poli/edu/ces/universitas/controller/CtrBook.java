package co.poli.edu.ces.universitas.controller;

import co.poli.edu.ces.universitas.dto.DtoBook;
import co.poli.edu.ces.universitas.model.Book;

import java.sql.SQLException;
import java.util.ArrayList;

public class CtrBook {

    private Book modelBook;

    public CtrBook(){
        modelBook = new Book();
    }

    public DtoBook addBook(DtoBook student){
        try {
            Book newBook = modelBook.create(student);
            return new DtoBook(newBook.getId(), newBook.getTitulo(), newBook.getAutor());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<DtoBook> getAllBooks() {
        try {
            ArrayList<Book> books = modelBook.all(); // Llama al método 'all' del modelo
            ArrayList<DtoBook> dtoBooks = new ArrayList<>();

            for (Book book : books) {
                DtoBook dtoBook = new DtoBook(
                        book.getId(),
                        book.getTitulo(),
                        book.getAutor()
                );
                dtoBooks.add(dtoBook);
            }

            return dtoBooks;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public DtoBook getBookById(int studentId) {
        try {
            Book book = modelBook.findById(studentId);
            if (book != null) {
                return new DtoBook(book.getId(), book.getTitulo(), book.getAutor());
            } else {
                throw new RuntimeException("Estudiante no encontrado");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public DtoBook updateBook(int studentId, DtoBook updatedStudent) {
        try {
            Book book = new Book(
                    studentId,
                    updatedStudent.getTitulo(),
                    updatedStudent.getAutor()

            );

            Book updated = modelBook.update(book);
            return new DtoBook(updated.getId(), updated.getTitulo(), updated.getAutor());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteBook(int studentId) {
        try {
            modelBook.delete(studentId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
