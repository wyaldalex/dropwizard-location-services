package com.tudux;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;

public class LocationsApplication extends Application<Configuration> {


    public static void main(String[] args) throws Exception {
        new LocationsApplication().run(args);
    }

    @Override
    public void run(Configuration configuration, Environment environment) throws Exception {
        System.out.println("Hello microservices");
    }
}
