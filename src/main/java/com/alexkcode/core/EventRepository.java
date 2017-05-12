package com.alexkcode.core;

import com.alexkcode.model.Event;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by omni on 5/11/17.
 */
public interface EventRepository extends MongoRepository<Event, String> {

    Event add();

    List<Event> getAll();

    Event getOne(String id);

    void delete();

}
