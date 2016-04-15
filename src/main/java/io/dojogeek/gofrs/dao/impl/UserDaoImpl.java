package io.dojogeek.gofrs.dao.impl;

import io.dojogeek.gofrs.dao.UserDao;
import io.dojogeek.gofrs.dao.models.UserModel;
import io.dojogeek.gofrs.util.HibernateUtil;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Irene on 4/13/16.
 */

@Repository
@Transactional
public class UserDaoImpl extends HibernateUtil implements UserDao{

    public UserModel createUser(UserModel userModel) {

        Session session = getCurrentSession();
        session.save(userModel);
        return userModel;
    }
}
