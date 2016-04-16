package io.dojogeek.gofrs.rest.impl;

import com.wordnik.swagger.annotations.ApiParam;
import io.dojogeek.gofrs.business.UserService;
import io.dojogeek.gofrs.rest.UserRest;
import io.dojogeek.gofrs.rest.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

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

    @Path("/{id}")
    @GET
    public Response getUserById(@ApiParam(value = "id", required = true) @PathParam(value = "id")String id) {

        List<User> userList = userService.getUserById(id);
        return Response.ok().entity(new GenericEntity<List<User>>(userList){}).type(MediaType.APPLICATION_JSON).build();
    }
}
