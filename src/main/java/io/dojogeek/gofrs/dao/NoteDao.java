package io.dojogeek.gofrs.dao;

import io.dojogeek.gofrs.dao.models.NotesModel;

import java.util.List;

/**
 * Created by Irene on 3/29/16.
 */
public interface NoteDao {

    NotesModel createNote(NotesModel notesModel);

    List<NotesModel> getNotesByUserId(String userId);

    NotesModel updateNote(NotesModel notesModel);

    void deleteNote(String id);
}
