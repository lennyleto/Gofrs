package io.dojogeek.gofrs.dao.models;

import lombok.Data;
import org.joda.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Irene on 3/1/16.
 */
@Data
@Entity
@Table(name = "readings")
public class Reading {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "userId")
    private String userId;

    @Column(name = "initialDate")
    private Date initialDate;

    @Column(name = "devotedHours")
    private LocalTime devotedHours;

    @Column(name = "seenPages")
    private int seenPages;

    @Column(name = "pagesBeRead")
    private int pagesBeRead;

    @Column(name = "stimatedPages")
    private  int stimatedPages;

    @Column(name = "idBook")
    private int idBook;

    @Column(name = "chapter")
    private String chapter;
}
