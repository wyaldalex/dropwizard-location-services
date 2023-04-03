package com.tudux.buisness.service;

import com.tudux.db.LocationsDAO;
import com.tudux.model.Location;

import java.util.List;

public class LocationService {

    private LocationsDAO locationsDAO;

    public LocationService(final LocationsDAO locationsDAO) {
        this.locationsDAO = locationsDAO;
    }

    public List<Location> getLocations(){
        return this.locationsDAO.getAll();
    }

}
