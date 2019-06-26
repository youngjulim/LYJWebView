package com.lyj.webview.model;

public interface WebViewClientCallBack {

    void onPageStart(String url);
    void onPageFinish(String url);

}
