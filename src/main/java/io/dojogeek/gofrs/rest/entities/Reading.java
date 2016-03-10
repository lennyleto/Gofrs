package io.dojogeek.gofrs.rest.entities;

import lombok.Data;
import org.joda.time.LocalTime;

import java.util.Date;


/**
 * Created by Irene on 2/18/16.
 */
@Data
public class Reading {

    private Integer id;
    private Integer userId;
    private Date initialDate;
    private LocalTime devotedHours;
    private Integer seenPages;
    private Integer pagesBeRead;
    private  Integer stimatedPages;
    private Integer idBook;
    private String chapter;
}
