package io.dojogeek.gofrs.rest.entities;

import lombok.Data;
import org.joda.time.LocalTime;

import java.util.Date;


/**
 * Created by Irene on 2/18/16.
 */
@Data
public class Reading {

    private String id;
    private String userId;
    private Date initialDate;
    private LocalTime devotedHours;
    private int seenPages;
    private int pagesBeRead;
    private  int stimatedPages;
    private int idBook;
    private String chapter;
}
