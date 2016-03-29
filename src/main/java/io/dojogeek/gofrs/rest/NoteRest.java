package io.dojogeek.gofrs.rest;

import io.dojogeek.gofrs.rest.entities.Notes;

import javax.ws.rs.core.Response;

/**
 * Created by Irene on 3/29/16.
 */
public interface NoteRest {

    Response createNote(Notes notes);

    Response getNotesByUserId(String userId);

    Response updateNote(String id, Notes notes);

    Response deleteNote(String id);
}
