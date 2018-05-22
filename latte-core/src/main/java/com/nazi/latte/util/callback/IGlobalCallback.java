package com.nazi.latte.util.callback;

import android.support.annotation.Nullable;

/**
 * Created by nazi
 */

public interface IGlobalCallback<T> {

    void executeCallback(@Nullable T args);
}
