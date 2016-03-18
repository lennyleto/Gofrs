package io.dojogeek.gofrs.dao.impl;

import io.dojogeek.gofrs.dao.BookDao;
import io.dojogeek.gofrs.dao.models.BookModel;
import io.dojogeek.gofrs.util.HibernateUtil;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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

    public BookModel getBookByUserId(String userId) {
        return null;
    }

    public BookModel updateBook(BookModel bookModel) {
        return null;
    }

    public void deleteBook(String id) {

    }
}
