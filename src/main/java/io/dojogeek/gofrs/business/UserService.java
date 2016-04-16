package io.dojogeek.gofrs.business;

import io.dojogeek.gofrs.rest.entities.User;

import java.util.List;

/**
 * Created by Irene on 4/13/16.
 */
public interface UserService {

    User createUser(User user);

    List<User> getUserById(String id);

    User updateUser(String id, User user);
}
