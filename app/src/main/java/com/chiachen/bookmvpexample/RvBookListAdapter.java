package com.chiachen.bookmvpexample;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.chiachen.bookmvpexample.mvp.BookListContract;

/**
 * Created by jianjiacheng on 10/04/2018.
 */

class RvBookListAdapter extends RecyclerView.Adapter {

    private BookListContract.Presenter mPresenter;

    public RvBookListAdapter(BookListContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BookViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_book, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        mPresenter.onBindViewHolder(((BookViewHolder) holder), position);
    }

    @Override
    public int getItemCount() {
        return mPresenter.getBookListCount();
    }
}
