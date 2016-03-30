package io.dojogeek.gofrs.rest.impl;

import io.dojogeek.gofrs.business.NoteService;
import io.dojogeek.gofrs.rest.NoteRest;
import io.dojogeek.gofrs.rest.entities.Notes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

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

    public Response getNotesByUserId(String userId) {
        return null;
    }

    public Response updateNote(String id, Notes notes) {
        return null;
    }

    public Response deleteNote(String id) {
        return null;
    }
}
