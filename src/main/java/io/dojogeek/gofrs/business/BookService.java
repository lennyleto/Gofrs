package io.dojogeek.gofrs.business;

import io.dojogeek.gofrs.rest.entities.Book;

/**
 * Created by Irene on 3/17/16.
 */
public interface BookService {

    Book createBook(Book book);

    Book getBookByUserId(String userId);

    Book updateBook(String id, Book book);

    void deleteBook(String id);
}
