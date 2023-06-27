package de.alwi.instagram;

import de.alwi.instagram.endpoints.UserEndpoint;
import de.alwi.instagram.utils.CorsFilter;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("rest")
public class IGDiffApplication extends Application {

    @Override
    public Set<Class<?>>  getClasses() {
        final Set<Class<?>> classes = new HashSet<>();
        classes.add(JacksonProducer.class);
        classes.add(UserEndpoint.class);

        return classes;
    }

    @Override
    public Set<Object> getSingletons() {
        Set<Object> singletons = new HashSet<>();
        CorsFilter corsFilter = new CorsFilter();
        singletons.add(corsFilter);

        return singletons;
    }

}
