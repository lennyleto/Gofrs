package io.dojogeek.gofrs.dao.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Irene on 3/1/16.
 */
@Data
@Entity
@Table(name = "books")
public class BookModel {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "releaseDate")
    private Date releaseDate;

    @Column(name = "editorial")
    private String editorial;

    @Column(name = "category")
    private String category;

    @Column(name = "totalPages")
    private int totalPages;

    @Column(name = "userId")
    private Integer userId;
}
