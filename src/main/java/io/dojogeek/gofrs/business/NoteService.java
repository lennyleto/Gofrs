package io.dojogeek.gofrs.business;

import io.dojogeek.gofrs.rest.entities.Notes;

import java.util.List;

/**
 * Created by Irene on 3/29/16.
 */
public interface NoteService {

    Notes createNote(Notes notes);

    List<Notes> getNotesByUserId(String userId);

    Notes updateNote(String id, Notes notes);

    void deleteNote(String id);
}
