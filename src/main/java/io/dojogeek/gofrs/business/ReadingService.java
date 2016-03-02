package io.dojogeek.gofrs.business;

import io.dojogeek.gofrs.rest.entities.Reading;

/**
 * Created by Irene on 3/1/16.
 */
public interface ReadingService {

    Reading createReading(Reading reading);

    Reading updateReading(String id, Reading reading);

    Reading deleteReading(String id);

    Reading getReadingsByUserId(String userId);
}
