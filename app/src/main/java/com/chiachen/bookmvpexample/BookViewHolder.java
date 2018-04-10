package com.chiachen.bookmvpexample;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.chiachen.bookmvpexample.data.Book;
import com.chiachen.bookmvpexample.mvp.BookListContract;

/**
 * Created by jianjiacheng on 10/04/2018.
 */

public class BookViewHolder extends RecyclerView.ViewHolder implements BookListContract.BookItemView{

    private TextView type;
    private TextView price;
    private TextView amount;

    public BookViewHolder(View view) {
        super(view);
        type = view.findViewById(R.id.tvType);
        price = view.findViewById(R.id.tvPrice);
        amount = view.findViewById(R.id.tvAmount);
    }

    public TextView getType() {
        return type;
    }

    public TextView getPrice() {
        return price;
    }

    public TextView getAmount() {
        return amount;
    }

    @Override
    public void bindData(Book book) {
        getAmount().setText(String.valueOf(book.getAmount()));
        getPrice().setText(String.valueOf(book.getPrice()));
        getType().setText(book.getType());
    }
}
