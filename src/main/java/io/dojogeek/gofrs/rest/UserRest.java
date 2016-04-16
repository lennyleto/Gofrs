package io.dojogeek.gofrs.rest;

import io.dojogeek.gofrs.rest.entities.User;

import javax.ws.rs.core.Response;

/**
 * Created by Irene on 4/13/16.
 */
public interface UserRest {

    Response createUser(User user);

    Response getUserById(String id);

    Response updateUser(String id, User user);
}
