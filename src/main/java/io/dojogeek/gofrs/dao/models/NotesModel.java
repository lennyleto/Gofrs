package io.dojogeek.gofrs.dao.models;

import lombok.Data;
import org.joda.time.DateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Irene on 3/1/16.
 */
@Data
@Entity
@Table(name = "notes")
public class NotesModel {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "title")
    private String title;

    @Column(name = "date")
    private DateTime date;

    @Column(name = "body")
    private String body;

    @Column(name = "idBook")
    private String idBook;
}
