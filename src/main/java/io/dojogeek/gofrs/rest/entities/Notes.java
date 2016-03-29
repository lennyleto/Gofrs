package io.dojogeek.gofrs.rest.entities;

import lombok.Data;
import java.util.Date;

/**
 * Created by Irene on 2/18/16.
 */
@Data
public class Notes {

    private Integer id;
    private String title;
    private Date date;
    private String body;
    private Integer idBook;
}
