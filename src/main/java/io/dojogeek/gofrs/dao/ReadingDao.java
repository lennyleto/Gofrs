package io.dojogeek.gofrs.dao;

import io.dojogeek.gofrs.dao.models.ReadingModel;

/**
 * Created by Irene on 3/1/16.
 */
public interface ReadingDao {

    ReadingModel createReading(ReadingModel readingModel);

    ReadingModel updateReading(String id, ReadingModel readingModel);

    ReadingModel deleteReading(String id);

    ReadingModel getReadingsByUserId(String userId);
}
