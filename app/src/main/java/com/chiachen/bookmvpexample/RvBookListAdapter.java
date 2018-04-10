package com.chiachen.bookmvpexample;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.chiachen.bookmvpexample.data.Book;

import java.util.List;

/**
 * Created by jianjiacheng on 10/04/2018.
 */

class RvBookListAdapter extends RecyclerView.Adapter {

    private List<Book> mBooks;

    public RvBookListAdapter(List<Book> books) {
        mBooks = books;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BookViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_book, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Book tempBook = mBooks.get(position);
        ((BookViewHolder) holder).getAmount().setText(String.valueOf(tempBook.getAmount()));
        ((BookViewHolder) holder).getPrice().setText(String.valueOf(tempBook.getPrice()));
        ((BookViewHolder) holder).getType().setText(tempBook.getType());
    }

    @Override
    public int getItemCount() {
        return mBooks.size();
    }
}
