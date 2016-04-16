package io.dojogeek.gofrs.dao;

import io.dojogeek.gofrs.dao.models.UserModel;

import java.util.List;

/**
 * Created by Irene on 4/13/16.
 */
public interface UserDao {

    UserModel createUser(UserModel userModel);

    List<UserModel> getUserById(String id);

    UserModel updateUser(UserModel userModel);

    void deleteUser(String id);
}
