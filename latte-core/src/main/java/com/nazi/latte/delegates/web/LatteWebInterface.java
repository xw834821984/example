package com.nazi.latte.delegates.web;

import android.webkit.JavascriptInterface;

import com.alibaba.fastjson.JSON;
import com.nazi.latte.delegates.web.event.Event;
import com.nazi.latte.delegates.web.event.EventManager;
import com.nazi.latte.util.log.LatteLogger;

/**
 * Created by nazi on
 * date： 2018/1/26
 * 跟原生web交互
 */

final class LatteWebInterface {
    private final WebDelegate DELEGATE;

    private LatteWebInterface(WebDelegate delegate) {
        this.DELEGATE = delegate;
    }

    static LatteWebInterface create(WebDelegate delegate) {
        return new LatteWebInterface(delegate);
    }

    @SuppressWarnings("unused")
    @JavascriptInterface
    public String event(String params) {
        final String action = JSON.parseObject(params).getString("action");
        final Event event = EventManager.getInstance().createEvent(action);
        LatteLogger.d("WEB_EVENT",params);
        if (event != null) {
            event.setAction(action);
            event.setDelegate(DELEGATE);
            event.setContext(DELEGATE.getContext());
            event.setUrl(DELEGATE.getUrl());
            return event.execute(params);
        }
        return null;
    }
}
