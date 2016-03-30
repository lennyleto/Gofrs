package io.dojogeek.gofrs.dao.impl;

import io.dojogeek.gofrs.dao.BookDao;
import io.dojogeek.gofrs.dao.models.BookModel;
import io.dojogeek.gofrs.dao.models.NotesModel;
import io.dojogeek.gofrs.rest.entities.Book;
import io.dojogeek.gofrs.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Irene on 3/17/16.
 */
@Repository
@Transactional
public class BookDaoImpl extends HibernateUtil implements BookDao {

    public BookModel createBook(BookModel bookModel) {
        Session session = getCurrentSession();
        session.save(bookModel);
        return bookModel;
    }

    public List<BookModel> getBookByUserId(String userId) {

        Session session = getCurrentSession();
        Criteria criteria = session.createCriteria(BookModel.class).add(Restrictions.eq("userId", Integer.parseInt(userId)));
        List<BookModel> bookModel = criteria.list();
        return bookModel;
    }

    public BookModel updateBook(BookModel bookModel) {
        Session session = getCurrentSession();
        session.update(bookModel);
        return bookModel;
    }

    public void deleteBook(String id) {
        Session session = getCurrentSession();
        BookModel bookModel = new BookModel();
        bookModel.setId(Integer.parseInt(id));
        session.delete(bookModel);
    }
}
