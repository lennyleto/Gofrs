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
public class ReadingModel {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "userId")
    private Integer userId;

    @Column(name = "initialDate")
    private Date initialDate;

    @Column(name = "devotedHours")
    private LocalTime devotedHours;

    @Column(name = "seenPages")
    private Integer seenPages;

    @Column(name = "pagesBeRead")
    private Integer pagesBeRead;

    @Column(name = "stimatedPages")
    private  Integer stimatedPages;

    @Column(name = "idBook")
    private Integer idBook;

    @Column(name = "chapter")
    private String chapter;
}
