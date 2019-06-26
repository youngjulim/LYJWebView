package com.lyj.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.lyj.webview.model.WebViewClientCallBack;

public class LYJWebViewClient extends WebViewClient {

    private Context mContext;
    private WebViewClientCallBack webViewClientCallBack;

    public LYJWebViewClient(Context context){
        this.mContext = context;
    }
    public LYJWebViewClient(Context context, WebViewClientCallBack callBack){
        this.mContext = context;
        this.webViewClientCallBack = callBack;
    }

    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        this.webViewClientCallBack.onPageStart(url);
    }

    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        this.webViewClientCallBack.onPageFinish(url);
    }
}
