package io.dojogeek.gofrs.dao;

import io.dojogeek.gofrs.dao.models.Reading;

/**
 * Created by Irene on 3/1/16.
 */
public interface ReadingDao {

    Reading createReading(Reading reading);

    Reading updateReading(String id, Reading reading);

    Reading deleteReading(String id);

    Reading getReadingsByUserId(String userId);
}
