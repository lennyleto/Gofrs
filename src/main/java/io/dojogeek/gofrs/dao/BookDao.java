package io.dojogeek.gofrs.dao;

import io.dojogeek.gofrs.dao.models.BookModel;

import java.util.List;

/**
 * Created by Irene on 3/17/16.
 */
public interface BookDao {

    BookModel createBook(BookModel bookModel);

    List<BookModel> getBookByUserId(String userId);

    BookModel updateBook(BookModel bookModel);

    void deleteBook(String id);
}
