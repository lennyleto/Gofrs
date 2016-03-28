package io.dojogeek.gofrs.rest.impl;

import com.wordnik.swagger.annotations.ApiParam;
import io.dojogeek.gofrs.business.ReadingService;
import io.dojogeek.gofrs.rest.ReadingRest;
import io.dojogeek.gofrs.rest.entities.Reading;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by Irene on 2/18/16.
 */
@Path("/reading")
@Service
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ReadingRestImpl implements ReadingRest {

    @Autowired
    private ReadingService readingService;

    @POST
    @Path("/")
    public Response createReading(Reading reading) {
        return Response.ok(readingService.createReading(reading)).type(MediaType.APPLICATION_JSON).build();
    }

    @PUT
    @Path("/{id}")
    public Response updateReading(@ApiParam(value = "id", required = true) @PathParam(value = "id") String id, Reading reading) {
        return Response.ok(readingService.updateReading(id, reading)).type(MediaType.APPLICATION_JSON).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteReading(@ApiParam(value = "id", required = true) @PathParam(value = "id") String id) {
        readingService.deleteReading(id);
        return Response.status(200).build();
    }

    @GET
    @Path("/{userId}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getReadingsByUserId(@ApiParam(value = "userId", required = true) @PathParam(value = "userId") String userId) {
        List<Reading> readingList = readingService.getReadingsByUserId(userId);
        return Response.ok().entity(new GenericEntity<List<Reading>>(readingList){}).type(MediaType.APPLICATION_JSON).build();
    }
}
