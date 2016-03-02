package io.dojogeek.gofrs.rest.entities;

import lombok.Data;
import org.joda.time.DateTime;

/**
 * Created by Irene on 2/18/16.
 */
@Data
public class Notes {

    private String id;
    private String title;
    private DateTime date;
    private String body;
    private String idBook;
}
