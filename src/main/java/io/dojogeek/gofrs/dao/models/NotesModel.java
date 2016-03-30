package io.dojogeek.gofrs.dao.models;

import lombok.Data;
import javax.persistence.*;
import java.util.Date;

/**
 * Created by Irene on 3/1/16.
 */
@Data
@Entity
@Table(name = "notes")
public class NotesModel {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "date")
    private Date date;

    @Column(name = "body")
    private String body;

    @Column(name = "idBook")
    private Integer idBook;

    @Column(name = "userId")
    private Integer userId;
}
