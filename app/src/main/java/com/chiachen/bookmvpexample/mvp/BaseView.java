package com.chiachen.bookmvpexample.mvp;

/**
 * Created by jianjiacheng on 10/04/2018.
 */

public interface BaseView<T> {

    void setPresenter(T presenter);
}
