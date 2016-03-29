package io.dojogeek.gofrs.dao.impl;

import io.dojogeek.gofrs.dao.NoteDao;
import io.dojogeek.gofrs.dao.models.NotesModel;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Irene on 3/29/16.
 */
@Repository
@Transactional
public class NoteDaoImpl implements NoteDao {

    public NotesModel createNote(NotesModel notesModel) {
        return null;
    }

    public List<NotesModel> getNotesByUserId(String userId) {
        return null;
    }

    public NotesModel updateNote(NotesModel notesModel) {
        return null;
    }

    public void deleteNote(String id) {

    }
}
