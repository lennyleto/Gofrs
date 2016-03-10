package io.dojogeek.gofrs.business.mapper;

import io.dojogeek.gofrs.dao.models.ReadingModel;
import io.dojogeek.gofrs.rest.entities.Reading;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by Irene on 3/9/16.
 */
@Component("reading-mapper")
public class ReadingMapper {

    public ReadingModel mapToInner(Reading reading) {
        Mapper mapper = new DozerBeanMapper();
        ReadingModel readingModel = mapper.map(reading, ReadingModel.class);
        return readingModel;
    }


    public Reading mapToOuter(ReadingModel readingModel) {
        Mapper mapper = new DozerBeanMapper();
        Reading reading = mapper.map(readingModel, Reading.class);
        return reading;
    }
}
