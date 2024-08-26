package com.example.resource;

import com.example.db.entity.Allergen;
import com.example.db.service.AllergenService;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/petapi/allergy")
public class AllergenResource {

    @Inject
    AllergenService allergenService;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response ctx(@PathParam("id") Long id) {
        Allergen allergen = allergenService.findByAllergyId(id);
        if (allergen == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok(allergen).build();
    }

}
