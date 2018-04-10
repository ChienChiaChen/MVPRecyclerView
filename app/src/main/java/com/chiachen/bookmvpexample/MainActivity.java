package com.chiachen.bookmvpexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.chiachen.bookmvpexample.data.Book;
import com.chiachen.bookmvpexample.data.source.BookRepository;
import com.chiachen.bookmvpexample.mvp.BookListContract;
import com.chiachen.bookmvpexample.mvp.BookListPresenter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements BookListContract.View {

    private BookListContract.Presenter mPresenter;

    private BookRepository mBookRepository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBookRepository = new BookRepository();
        mPresenter = new BookListPresenter(mBookRepository, this);
        setPresenter(mPresenter);
    }

    @Override
    public void setPresenter(BookListContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    protected void onResume() {
        super.onResume();
        mPresenter.start();
    }

    @Override
    public void showBooks(List<Book> books) {
        ((RecyclerView) findViewById(R.id.rvBooks)).hasFixedSize();
        ((RecyclerView) findViewById(R.id.rvBooks)).setLayoutManager(new LinearLayoutManager(this));
        ((RecyclerView) findViewById(R.id.rvBooks)).setAdapter(new RvBookListAdapter(books));
    }
}
