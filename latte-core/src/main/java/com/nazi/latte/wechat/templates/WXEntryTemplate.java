package com.nazi.latte.wechat.templates;


import com.nazi.latte.wechat.LatteWeChat;
import com.nazi.latte.wechat.BaseWXEntryActivity;

public class WXEntryTemplate extends BaseWXEntryActivity {

    @Override
    protected void onResume() {
        super.onResume();
        finish();
        overridePendingTransition(0, 0);
    }

    @Override
    protected void onSignInSuccess(String userInfo) {
        LatteWeChat.getInstance().getSignInCallback().onSignInSuccess(userInfo);
    }
}
