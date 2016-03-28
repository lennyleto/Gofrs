package io.dojogeek.gofrs.business;

import io.dojogeek.gofrs.rest.entities.Reading;

import java.util.List;

/**
 * Created by Irene on 3/1/16.
 */
public interface ReadingService {

    Reading createReading(Reading reading);

    Reading updateReading(String id, Reading reading);

    void deleteReading(String id);

    List<Reading> getReadingsByUserId(String userId);
}
