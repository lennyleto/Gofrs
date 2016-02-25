package io.dojogeek.gofrs.rest.entities;

import lombok.Data;
import org.joda.time.DateTime;

/**
 * Created by Irene on 2/18/16.
 */
@Data
public class Book {

    private String id;
    private String title;
    private String author;
    private DateTime releaseDate ;
    private String editorial;
    private String category;
    private int totalPages;
}
