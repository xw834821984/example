package com.nazi.latte.delegates.web.event;

import com.nazi.latte.util.log.LatteLogger;

/**
 * Created by nazi
 */

public class UndefineEvent extends Event {
    @Override
    public String execute(String params) {
        LatteLogger.e("UndefineEvent", params);
        return null;
    }
}
