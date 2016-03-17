package io.dojogeek.gofrs.rest;

import io.dojogeek.gofrs.rest.entities.Book;

import javax.ws.rs.core.Response;

/**
 * Created by Irene on 3/17/16.
 */
public interface BookRest {

    Response createBook(Book book);

    Response getBookByUserId(String userId);

    Response updateBook(String id, Book book);

    Response deleteBook(String id);

}
