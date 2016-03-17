package io.dojogeek.gofrs.rest.entities;

import io.dojogeek.gofrs.rest.adapters.DateFormatterAdapter;
import lombok.Data;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Date;

/**
 * Created by Irene on 2/18/16.
 */
@Data
public class Book {

    private String id;
    private String title;
    private String author;
    @XmlJavaTypeAdapter(DateFormatterAdapter.class)
    private Date releaseDate ;
    private String editorial;
    private String category;
    private int totalPages;
}
