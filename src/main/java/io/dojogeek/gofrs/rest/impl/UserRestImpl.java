package io.dojogeek.gofrs.rest.impl;

import io.dojogeek.gofrs.business.UserService;
import io.dojogeek.gofrs.rest.UserRest;
import io.dojogeek.gofrs.rest.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by Irene on 4/13/16.
 */
@Path("/user")
@Service
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserRestImpl implements UserRest {

    @Autowired
    private UserService userService;

    @Path("/")
    @POST
    public Response createUser(User user) {
        return Response.ok(userService.createUser(user)).type(MediaType.APPLICATION_JSON).build();
    }
}
