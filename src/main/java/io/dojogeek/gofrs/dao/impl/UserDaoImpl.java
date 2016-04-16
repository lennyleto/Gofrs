package io.dojogeek.gofrs.dao.impl;

import io.dojogeek.gofrs.dao.UserDao;
import io.dojogeek.gofrs.dao.models.UserModel;
import io.dojogeek.gofrs.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Irene on 4/13/16.
 */

@Repository
@Transactional
public class UserDaoImpl extends HibernateUtil implements UserDao {

    public UserModel createUser(UserModel userModel) {

        Session session = getCurrentSession();
        session.save(userModel);
        return userModel;
    }

    public List<UserModel> getUserById(String id) {

        Session session = getCurrentSession();
        Criteria criteria = session.createCriteria(UserModel.class).add(Restrictions.eq("id", Integer.parseInt(id)));
        List<UserModel> userModels = criteria.list();
        return userModels;
    }

    public UserModel updateUser(UserModel userModel) {

        Session session = getCurrentSession();
        session.update(userModel);
        return userModel;
    }

    public void deleteUser(String id) {

        Session session = getCurrentSession();
        UserModel userModel = new UserModel();
        userModel.setId(Integer.parseInt(id));
        session.delete(userModel);

    }
}
