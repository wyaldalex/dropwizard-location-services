package com.tudux.api.resources;

import com.tudux.buisness.service.LocationService;
import com.tudux.model.Location;

import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/api/v1/locations")
@Consumes(MediaType.APPLICATION_JSON+"; charset=utf-8")
@Produces(MediaType.APPLICATION_JSON)
public class LocationResource {
    private LocationService locationService;

    public LocationResource(final LocationService locationService) {
        this.locationService = locationService;
    }

    // Get all locations from the DB
    @GET
    public Response getLocations() {
        //return Response.ok().entity("{\"id\": \"1\"}").build();
        return Response.ok().entity(this.locationService.getLocations()).build();
    }

    @GET
    @Path("{id}")
    public Response getLocation(@PathParam("id") final int id) {
        //return Response.ok().entity("{\"id\": \"1\"}").build();
        return Response.ok().entity(this.locationService.getLocations(id)).build();
    }


    @POST
    public Response createLocation(final @NotNull Location location) {
        //return Response.ok().entity("{\"id\": \"1\"}").build();
        return Response.ok().entity(this.locationService.createLocation(location)).build();
    }

    @PUT
    @Path("{id}")
    public Response updateLocation(final @NotNull Location location , @PathParam("id") final Long id) {
        Location locationToUpdate = location;
        locationToUpdate.setId(id);
        return Response.ok().entity(this.locationService.updateLocation(locationToUpdate)).build();
    }

    @DELETE
    @Path("{id}")
    public Response deleteLocation(@PathParam("id") final int id) {
        return Response.ok().entity(this.locationService.deleteLocation(id)).build();
    }
}
