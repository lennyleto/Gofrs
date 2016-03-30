package io.dojogeek.gofrs.rest.entities;

import io.dojogeek.gofrs.rest.adapters.DateFormatterAdapter;
import lombok.Data;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;

/**
 * Created by Irene on 2/18/16.
 */
@Data
public class Notes {

    private Integer id;
    private String title;
    @XmlJavaTypeAdapter(DateFormatterAdapter.class)
    private Date date;
    private String body;
    private Integer idBook;
    private Integer userId;
}
