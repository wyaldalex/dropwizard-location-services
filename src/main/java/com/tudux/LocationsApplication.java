package com.tudux;

import com.tudux.api.resources.LocationResource;
import com.tudux.buisness.service.LocationService;
import com.tudux.db.LocationsDAO;
import io.dropwizard.Application;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.setup.Environment;
import org.skife.jdbi.v2.DBI;

import javax.sql.DataSource;

public class LocationsApplication extends Application<LocationsConfigurations> {


    public static void main(String[] args) throws Exception {
        new LocationsApplication().run(args);
    }

    @Override
    public void run(LocationsConfigurations configuration, Environment environment) throws Exception {
        //System.out.println("Hello microservices");
        // Get the DataSourceFactory from the configuration object
        final DataSourceFactory dataSourceFactory = configuration.getDataSourceFactory();

        final DataSource dataSource = configuration.getDataSourceFactory().build(environment.metrics(), "mysql");
        final DBI dbi = new DBI(dataSource);

        final LocationsDAO locationsDao = dbi.onDemand(LocationsDAO.class);

        final LocationService locationsService = new LocationService(locationsDao);

        final LocationResource locationsResource = new LocationResource(locationsService);

        environment.jersey().register(locationsResource);
    }
}
