package com.nazi.latte.ui.recycler;

import android.view.View;

import com.chad.library.adapter.base.BaseViewHolder;

/**
 * Created by nazi on
 * date： 2018/1/11
 */
public class MultipleViewHolder extends BaseViewHolder {

    private MultipleViewHolder(View view) {
        super(view);
    }

    public static MultipleViewHolder create(View view) {
        return new MultipleViewHolder(view);
    }
}
