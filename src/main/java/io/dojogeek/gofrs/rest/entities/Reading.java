package io.dojogeek.gofrs.rest.entities;

import io.dojogeek.gofrs.rest.adapters.DateFormatterAdapter;
import lombok.Data;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.util.Date;

/**
 * Created by Irene on 2/18/16.
 */
@Data
public class Reading {

    private Integer id;
    private Integer userId;
    @XmlJavaTypeAdapter(DateFormatterAdapter.class)
    private Date initialDate;
    private Long timeRequiredInMinutes;
    private Integer seenPages;
    private Integer pagesBeRead;
    private Integer stimatedPages;
    private Integer idBook;
    private String chapter;
}