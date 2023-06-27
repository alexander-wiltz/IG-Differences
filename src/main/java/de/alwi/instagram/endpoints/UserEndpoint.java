package de.alwi.instagram.endpoints;

import de.alwi.instagram.dao.UserDAO;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("user")
public class UserEndpoint {

    @GET
    @Path("/all")
    @Produces({MediaType.APPLICATION_JSON})
    public List<UserDAO> getAllUsers() {
        return null;
    }

    @GET
    @Path("/find")
    @Produces({MediaType.APPLICATION_JSON})
    public List<UserDAO> getUserById(@QueryParam("id") Integer id) {
        return null;
    }

    @POST
    @Path("/add")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public List<UserDAO> addUser(UserDAO user) {
        return null;
    }

    @PUT
    @Path("/edit")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public List<UserDAO> editUser(@QueryParam("id") Integer id, UserDAO user) {
        return null;
    }

}
