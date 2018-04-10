package com.chiachen.bookmvpexample;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by jianjiacheng on 10/04/2018.
 */

class BookViewHolder extends RecyclerView.ViewHolder {

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
}
