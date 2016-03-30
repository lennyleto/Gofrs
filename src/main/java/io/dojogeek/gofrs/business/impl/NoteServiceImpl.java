package io.dojogeek.gofrs.business.impl;

import io.dojogeek.gofrs.business.NoteService;
import io.dojogeek.gofrs.business.mapper.NotesMapper;
import io.dojogeek.gofrs.dao.NoteDao;
import io.dojogeek.gofrs.rest.entities.Notes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Irene on 3/29/16.
 */
@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteDao noteDao;

    @Autowired
    @Qualifier("notes-mapper")
    private NotesMapper notesMapper;

    public Notes createNote(Notes notes) {
        return notesMapper.mapToOuter(noteDao.createNote(notesMapper.mapToInner(notes)));
    }

    public List<Notes> getNotesByUserId(String userId) {
        return notesMapper.mapNoteList(noteDao.getNotesByUserId(userId));
    }

    public Notes updateNote(String id, Notes notes) {
        notes.setId(Integer.parseInt(id));
        return notesMapper.mapToOuter(noteDao.updateNote(notesMapper.mapToInner(notes)));
    }

    public void deleteNote(String id) {
        noteDao.deleteNote(id);
    }
}
