package io.dojogeek.gofrs.rest.impl;

import io.dojogeek.gofrs.rest.BookRest;
import io.dojogeek.gofrs.rest.entities.Book;
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

    @POST
    @Path("/")
    public Response createBook(Book book) {
        return null;
    }

    @GET
    @Path("/{userId}")
    public Response getBookByUserId(String userId) {
        return null;
    }

    @PUT
    @Path("/{id}")
    public Response updateBook(String id, Book book) {
        return null;
    }

    @DELETE
    @Path("/{id}")
    public Response deleteBook(String id) {
        return null;
    }
}
