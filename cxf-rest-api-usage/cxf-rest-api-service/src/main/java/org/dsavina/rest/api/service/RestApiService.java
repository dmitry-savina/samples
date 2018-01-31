package org.dsavina.rest.api.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.dsavina.rest.api.resources.User;

public interface RestApiService {

    @GET
    @Path("/users")
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> listUsers();
}
