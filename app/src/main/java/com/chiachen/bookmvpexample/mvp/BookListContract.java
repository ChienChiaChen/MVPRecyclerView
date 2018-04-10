package com.chiachen.bookmvpexample.mvp;

import com.chiachen.bookmvpexample.data.Book;

import java.util.List;

/**
 * Created by jianjiacheng on 10/04/2018.
 */

public interface BookListContract {
    interface View extends BaseView<Presenter> {
        void showBooks(List<Book> books);
    }

    interface Presenter extends BasePresenter {
        void loadBook();
    }
}
