package io.dojogeek.gofrs.business.mapper;

import io.dojogeek.gofrs.dao.models.BookModel;
import io.dojogeek.gofrs.rest.entities.Book;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.stereotype.Component;

/**
 * Created by Irene on 3/10/16.
 */
@Component("book-mapper")
public class BookMapper {

    public BookModel mapToInner(Book book) {
        Mapper mapper = new DozerBeanMapper();
        BookModel bookModel = mapper.map(book, BookModel.class);
        return bookModel;
    }

    public Book mapToOuter(BookModel bookModel) {
        Mapper mapper = new DozerBeanMapper();
        Book book = mapper.map(bookModel, Book.class);
        return book;
    }
}
