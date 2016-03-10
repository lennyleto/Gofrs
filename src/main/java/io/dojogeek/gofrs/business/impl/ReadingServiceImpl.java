package io.dojogeek.gofrs.business.impl;

import io.dojogeek.gofrs.business.ReadingService;
import io.dojogeek.gofrs.business.mapper.ReadingMapper;
import io.dojogeek.gofrs.dao.ReadingDao;
import io.dojogeek.gofrs.dao.models.ReadingModel;
import io.dojogeek.gofrs.rest.entities.Reading;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Irene on 3/1/16.
 */
@Service
public class ReadingServiceImpl implements ReadingService {

    @Autowired
    ReadingDao readingDao;

    @Autowired
    @Qualifier("reading-mapper")
    private ReadingMapper readingMapper;

    public Reading createReading(Reading reading) {
        ReadingModel readingModel = readingDao.createReading(readingMapper.mapToInner(reading));
        return readingMapper.mapToOuter(readingModel);
    }

    public Reading updateReading(String id, Reading reading) {
        reading.setId(Integer.parseInt(id));
        ReadingModel readingModel = readingDao.updateReading(readingMapper.mapToInner(reading));
        return readingMapper.mapToOuter(readingModel);
    }

    public Reading deleteReading(String id) {
        return null;
    }

    public Reading getReadingsByUserId(String userId) {
        return null;
    }
}
