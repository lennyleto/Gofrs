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
@Table(name = "books")
public class BookModel {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "releaseDate")
    private DateTime releaseDate;

    @Column(name = "editorial")
    private String editorial;

    @Column(name = "category")
    private String category;

    @Column(name = "totalPages")
    private int totalPages;
}
