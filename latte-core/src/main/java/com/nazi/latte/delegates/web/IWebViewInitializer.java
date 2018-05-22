package com.nazi.latte.delegates.web;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by nazi on
 * date： 2018/1/26
 */

public interface IWebViewInitializer {

    WebView initWebView(WebView webView);
    // 是针对于浏览器本身行为的控制
    WebViewClient initWebViewClient();
    // 是针对于内部页面的控制
    WebChromeClient initWebChromeClient();
}
