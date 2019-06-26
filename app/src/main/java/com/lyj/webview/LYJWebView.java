package com.lyj.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebView;

import com.lyj.webview.bridge.WebViewBridge;
import com.lyj.webview.model.JavaScriptCallBack;
import com.lyj.webview.model.WebViewClientCallBack;

public class LYJWebView extends WebView {

    private static final String javascriptInterfaceName = "android";

    private Context mContext;
    private WebViewClientCallBack mWebViewClientCallBack;
    private JavaScriptCallBack mJavaScriptCallBack;
    private LYJWebViewChromeClient mChromeClient;

    public LYJWebView(Context context) {
        super(context);
        this.mContext = context;
    }
    public void setWebVIewClientCallBack(WebViewClientCallBack clientCallBack){
        this.mWebViewClientCallBack = clientCallBack;
    }
    public void setJavaScriptCallBack(JavaScriptCallBack javaScriptCallBack){
        this.mJavaScriptCallBack = javaScriptCallBack;
    }

    public LYJWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
    }

    public void init(){
        this.getSettings().setJavaScriptEnabled(true);
        this.getSettings().setTextZoom(100);
        if(mWebViewClientCallBack == null){
            this.setWebViewClient(new LYJWebViewClient(mContext));
        }else{
            this.setWebViewClient(new LYJWebViewClient(mContext, mWebViewClientCallBack));
        }
        this.setWebChromeClient(mChromeClient = new LYJWebViewChromeClient(mContext));
        this.addJavascriptInterface(new WebViewBridge(mJavaScriptCallBack), javascriptInterfaceName);
    }

    public LYJWebViewChromeClient getLYJChromeClient(){
        return mChromeClient;
    }

}
