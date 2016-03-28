package io.dojogeek.gofrs.dao;

import io.dojogeek.gofrs.dao.models.ReadingModel;

import java.util.List;

/**
 * Created by Irene on 3/1/16.
 */
public interface ReadingDao {

    ReadingModel createReading(ReadingModel readingModel);

    ReadingModel updateReading(ReadingModel readingModel);

    void deleteReading(String id);

    List<ReadingModel> getReadingsByUserId(String userId);
}
