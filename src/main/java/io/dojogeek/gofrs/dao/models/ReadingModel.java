package io.dojogeek.gofrs.dao.models;

import lombok.Data;

import javax.persistence.*;
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
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(name = "userId")
    private Integer userId;

    @Column(name = "initialDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date initialDate;

    @Column(name = "timeRequiredInMinutes")
    private Long timeRequiredInMinutes;

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
