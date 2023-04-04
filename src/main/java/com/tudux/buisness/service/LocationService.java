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

    public Location getLocations(int id){
        return this.locationsDAO.getById(id);
    }


    public int createLocation(Location location){
        return this.locationsDAO.insert(location);
    }

    public int updateLocation(Location location){
        return this.locationsDAO.update(location);
    }

    public int deleteLocation(int id){
        return this.locationsDAO.delete(id);
    }

}
