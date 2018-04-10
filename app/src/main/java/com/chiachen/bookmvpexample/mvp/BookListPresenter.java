package com.chiachen.bookmvpexample.mvp;

import com.chiachen.bookmvpexample.data.source.BookRepository;

/**
 * Created by jianjiacheng on 10/04/2018.
 */

public class BookListPresenter implements BookListContract.Presenter {
    private BookRepository mBookRepository;
    private BookListContract.View mView;

    public BookListPresenter(BookRepository bookRepository, BookListContract.View view) {
        mBookRepository = bookRepository;
        mView = view;
    }


    @Override
    public void start() {
        loadBook();
    }

    @Override
    public void loadBook() {
        mView.showBooks(mBookRepository.fetchBookList());
    }
}
