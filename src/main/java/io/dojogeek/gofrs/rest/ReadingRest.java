package io.dojogeek.gofrs.rest;

import io.dojogeek.gofrs.rest.entities.Reading;

import javax.ws.rs.core.Response;

/**
 * Created by Irene on 2/18/16.
 */
public interface ReadingRest {

    Response createReading(Reading reading);

    Response updateReading(String id, Reading reading);

    Response deleteReading(String id);

    Response getReadingsByUserId(String userId);
}
