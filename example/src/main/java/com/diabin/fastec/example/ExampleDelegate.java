package com.diabin.fastec.example;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;

import com.nazi.latte.delegates.LatteDelegate;

import butterknife.OnClick;

/**
 * Created by nazi on
 * date： 2017/12/26
 */
public class ExampleDelegate extends LatteDelegate {

    @Override
    public Object setLayout() {
        return com.diabin.fastec.example.R.layout.delegate_example;
    }

    @OnClick(com.diabin.fastec.example.R.id.btn_test)
    void onClickTest() {
        testWX();

    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, @NonNull View rootView) {
//        testRestClient();
    }

    private void testWX() {
    }
}
