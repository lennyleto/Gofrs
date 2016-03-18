package io.dojogeek.gofrs.business.impl;

import io.dojogeek.gofrs.business.BookService;
import io.dojogeek.gofrs.business.mapper.BookMapper;
import io.dojogeek.gofrs.dao.BookDao;
import io.dojogeek.gofrs.rest.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Irene on 3/17/16.
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Autowired
    @Qualifier("book-mapper")
    private BookMapper bookMapper;

    public Book createBook(Book book) {

        return bookMapper.mapToOuter(bookDao.createBook(bookMapper.mapToInner(book)));
    }

   public Book getBookByUserId(String userId) {
        return null;
    }

    public Book updateBook(String id, Book book) {
        return null;
    }

    public void deleteBook(String id) {

    }
}
