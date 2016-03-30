package io.dojogeek.gofrs.dao.impl;

import io.dojogeek.gofrs.dao.ReadingDao;
import io.dojogeek.gofrs.dao.models.ReadingModel;
import io.dojogeek.gofrs.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Irene on 3/1/16.
 */
@Repository
@Transactional
public class ReadingDaoImpl extends HibernateUtil implements ReadingDao {

    public ReadingModel createReading(ReadingModel readingModel) {

        Session session = getCurrentSession();
        session.save(readingModel);
        return readingModel;
    }

    public ReadingModel updateReading(ReadingModel readingModel) {
        Session session = getCurrentSession();
        session.update(readingModel);
        return readingModel;
    }

    public void deleteReading(String id) {
        Session session = getCurrentSession();
        ReadingModel readingModel = new ReadingModel();
        readingModel.setId(Integer.parseInt(id));
        session.delete(readingModel);
    }

    public List<ReadingModel> getReadingsByUserId(String userId) {

        Session session = getCurrentSession();
        Criteria criteria = session.createCriteria(ReadingModel.class).add(Restrictions.eq("userId", Integer.parseInt(userId)));
        List<ReadingModel> readingModel = criteria.list();
        return readingModel;
    }
}
