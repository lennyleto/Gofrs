package io.dojogeek.gofrs.business.impl;

import io.dojogeek.gofrs.business.NoteService;
import io.dojogeek.gofrs.rest.entities.Notes;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Irene on 3/29/16.
 */
@Service
public class NoteServiceImpl implements NoteService {

    public Notes createNote(Notes notes) {
        return null;
    }

    public List<Notes> getNotesByUserId(String userId) {
        return null;
    }

    public Notes updateNote(String id, Notes notes) {
        return null;
    }

    public void deleteNote(String id) {

    }
}
