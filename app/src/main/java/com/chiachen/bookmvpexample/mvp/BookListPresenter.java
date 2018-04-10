package com.chiachen.bookmvpexample.mvp;

import com.chiachen.bookmvpexample.BookViewHolder;
import com.chiachen.bookmvpexample.data.Book;
import com.chiachen.bookmvpexample.data.source.BookRepository;

import java.util.List;

/**
 * Created by jianjiacheng on 10/04/2018.
 */

public class BookListPresenter implements BookListContract.Presenter {
    private BookRepository mBookRepository;
    private BookListContract.View mView;
    private List<Book> mBooks;

    public BookListPresenter(BookRepository bookRepository, BookListContract.View view) {
        mBookRepository = bookRepository;
        mView = view;
    }

    @Override
    public void onBindViewHolder(BookViewHolder holder, int position) {
        if (null == mBooks) return;

        holder.bindData(mBooks.get(position));
    }

    @Override
    public void start() {
        loadBook();
    }

    @Override
    public void loadBook() {
        if (null == mBookRepository.fetchBookList() || null == mView) {
            return;
        }

        mBooks = mBookRepository.fetchBookList();
        mView.showBooks(mBooks);
    }

    @Override
    public int getBookListCount() {
        return mBooks.size();
    }
}
