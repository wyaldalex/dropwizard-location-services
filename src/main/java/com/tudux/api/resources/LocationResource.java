package com.tudux.api.resources;

import com.tudux.buisness.service.LocationService;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
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
        return Response.ok().entity("{\"id\": \"1\"}").build();
    }
}
