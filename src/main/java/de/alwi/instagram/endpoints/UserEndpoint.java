package de.alwi.instagram.endpoints;

import de.alwi.instagram.dto.UserDTO;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("user")
public class UserEndpoint {

    @GET
    @Path("/all")
    @Produces({MediaType.APPLICATION_JSON})
    public List<UserDTO> getAllUsers() {
        return new ArrayList<>();
    }

    @GET
    @Path("/find")
    @Produces({MediaType.APPLICATION_JSON})
    public List<UserDTO> getUserById(@QueryParam("id") Integer id) {
        return null;
    }

    @POST
    @Path("/add")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public List<UserDTO> addUser(UserDTO user) {
        return null;
    }

    @PUT
    @Path("/edit")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public List<UserDTO> editUser(@QueryParam("id") Integer id, UserDTO user) {
        return null;
    }

}
