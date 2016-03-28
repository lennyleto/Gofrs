package io.dojogeek.gofrs.rest.impl;

import com.wordnik.swagger.annotations.ApiParam;
import io.dojogeek.gofrs.business.BookService;
import io.dojogeek.gofrs.rest.BookRest;
import io.dojogeek.gofrs.rest.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by Irene on 3/17/16.
 */
@Path("/book")
@Service
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BookRestImpl implements BookRest {

    @Autowired
    private BookService bookService;

    @POST
    @Path("/")
    public Response createBook(Book book) {
        return Response.ok(bookService.createBook(book)).type(MediaType.APPLICATION_JSON).build();
    }

    @GET
    @Path("/{userId}")
    public Response getBookByUserId(@ApiParam(value = "userId", required = true) @PathParam(value = "userId") String userId) {
        return Response.ok(bookService.getBookByUserId(userId)).type(MediaType.APPLICATION_JSON).build();
    }

    @PUT
    @Path("/{id}")
    public Response updateBook(@ApiParam(value = "id", required = true) @PathParam(value = "id") String id, Book book) {
        return Response.ok(bookService.updateBook(id, book)).type(MediaType.APPLICATION_JSON).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteBook(@ApiParam(value = "id", required = true) @PathParam(value = "id") String id) {
        bookService.deleteBook(id);
        return Response.status(200).build();
    }
}
