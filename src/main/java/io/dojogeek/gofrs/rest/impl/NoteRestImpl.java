package io.dojogeek.gofrs.rest.impl;

import com.wordnik.swagger.annotations.ApiParam;
import io.dojogeek.gofrs.business.NoteService;
import io.dojogeek.gofrs.rest.NoteRest;
import io.dojogeek.gofrs.rest.entities.Notes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by Irene on 3/29/16.
 */
@Path("/note")
@Service
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class NoteRestImpl implements NoteRest {

    @Autowired
    private NoteService noteService;

    @POST
    @Path("/")
    public Response createNote(Notes notes) {
        return Response.ok(noteService.createNote(notes)).type(MediaType.APPLICATION_JSON).build();
    }

    @GET
    @Path("/{userId}")
    public Response getNotesByUserId(@ApiParam(value = "userId", required = true) @PathParam(value = "userId") String userId) {
        List<Notes> notesList = noteService.getNotesByUserId(userId);
        return Response.ok().entity(new GenericEntity<List<Notes>>(notesList){}).type(MediaType.APPLICATION_JSON).build();
    }

    public Response updateNote(String id, Notes notes) {
        return null;
    }

    public Response deleteNote(String id) {
        return null;
    }
}
