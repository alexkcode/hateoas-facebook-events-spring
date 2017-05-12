package com.alexkcode;

import com.mongodb.Mongo;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

/**
 * Created by omni on 5/11/17.
 */
public class ApplicationConfig extends AbstractMongoConfiguration {
    @Override
    protected String getDatabaseName() {
        return null;
    }

    @Override
    public Mongo mongo() throws Exception {
        return null;
    }
}
