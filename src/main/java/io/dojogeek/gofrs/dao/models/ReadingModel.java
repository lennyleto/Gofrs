package io.dojogeek.gofrs.dao.models;

import lombok.Data;
import org.eclipse.persistence.annotations.PrimaryKey;
import org.joda.time.DateTime;
import org.joda.time.LocalTime;

import javax.persistence.*;

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
    private DateTime initialDate;

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
