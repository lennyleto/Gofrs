package io.dojogeek.gofrs.dao;

import io.dojogeek.gofrs.dao.models.UserModel;

/**
 * Created by Irene on 4/13/16.
 */
public interface UserDao {

    UserModel createUser(UserModel userModel);
}
