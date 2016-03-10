package io.dojogeek.gofrs.dao.impl;

import io.dojogeek.gofrs.dao.ReadingDao;
import io.dojogeek.gofrs.dao.models.ReadingModel;
import io.dojogeek.gofrs.util.HibernateUtil;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Irene on 3/1/16.
 */
@Repository
public class ReadingDaoImpl extends HibernateUtil implements ReadingDao {

    @Transactional
    public ReadingModel createReading(ReadingModel readingModel) {

        Session session = getCurrentSession();
        session.save(readingModel);
        return readingModel;
    }

    public ReadingModel updateReading(String id, ReadingModel readingModel) {
        return null;
    }

    public ReadingModel deleteReading(String id) {
        return null;
    }

    public ReadingModel getReadingsByUserId(String userId) {
        return null;
    }
}
