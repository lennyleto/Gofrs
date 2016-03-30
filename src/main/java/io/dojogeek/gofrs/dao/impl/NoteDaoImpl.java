package io.dojogeek.gofrs.dao.impl;

import io.dojogeek.gofrs.dao.NoteDao;
import io.dojogeek.gofrs.dao.models.NotesModel;
import io.dojogeek.gofrs.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Irene on 3/29/16.
 */
@Repository
@Transactional
public class NoteDaoImpl extends HibernateUtil implements NoteDao {

    public NotesModel createNote(NotesModel notesModel) {

        Session session = getCurrentSession();
        session.save(notesModel);
        return notesModel;
    }

    public List<NotesModel> getNotesByUserId(String userId) {

        Session session = getCurrentSession();
        Criteria criteria = session.createCriteria(NotesModel.class, userId);
        List<NotesModel> notesModels = criteria.list();
        return notesModels;
    }

    public NotesModel updateNote(NotesModel notesModel) {

        Session session = getCurrentSession();
        session.update(notesModel);
        return notesModel;
    }

    public void deleteNote(String id) {
        Session session = getCurrentSession();
        NotesModel notesModel = new NotesModel();
        notesModel.setId(Integer.parseInt(id));
        session.delete(notesModel);
    }
}
