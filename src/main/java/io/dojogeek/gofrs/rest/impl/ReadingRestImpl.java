package io.dojogeek.gofrs.rest.impl;

import io.dojogeek.gofrs.rest.ReadingRest;
import io.dojogeek.gofrs.rest.entities.Reading;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by Irene on 2/18/16.
 */
@Path("/reading")
@Service
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ReadingRestImpl implements ReadingRest {

    @POST
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createReading(Reading reading) {
        return null;
    }

    @PUT
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateReading(String id, Reading reading) {
        return null;
    }

    @DELETE
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteReading(String id) {
        return null;
    }

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getReadingsByUserId(String userId) {

        return null;
    }
}
