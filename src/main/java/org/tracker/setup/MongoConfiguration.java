package org.tracker.setup;

import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoConfiguration {

    private static final String DBNAME = "tracker";
    private static final String DATA_PACKAGE = "org.tracker.data";

    @Bean
    public Datastore mongoDataStore(){
        Morphia morphia = new Morphia();
        morphia.mapPackage(DATA_PACKAGE);
        Datastore datastore = morphia.createDatastore(new MongoClient(), DBNAME);
        datastore.ensureIndexes();
        return datastore;
    }

}
