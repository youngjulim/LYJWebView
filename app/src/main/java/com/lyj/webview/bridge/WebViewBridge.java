package com.lyj.webview.bridge;

import android.webkit.JavascriptInterface;

import com.lyj.webview.model.JavaScriptCallBack;

public class WebViewBridge {

    private JavaScriptCallBack mJavaScriptCallBack;

    public WebViewBridge(JavaScriptCallBack javaScriptCallBack){
        this.mJavaScriptCallBack = javaScriptCallBack;
    }

    @JavascriptInterface
    public void app_close(){
        mJavaScriptCallBack.app_close();
    }
    @JavascriptInterface
    public void os_dial(final String msg, final String functionName){
        mJavaScriptCallBack.os_dial(msg, functionName);
    }
    @JavascriptInterface
    public void go_view(final String url, String msg){
        mJavaScriptCallBack.go_view(url, msg);
    }
    @JavascriptInterface
    public void member_set(String loginID){
        mJavaScriptCallBack.member_set(loginID);
    }
    @JavascriptInterface
    public void member_get(){
        mJavaScriptCallBack.member_get();
    }
    @JavascriptInterface
    public void logout(){
        mJavaScriptCallBack.logout();
    }
    @JavascriptInterface
    public void get_now_position(){
        mJavaScriptCallBack.get_now_position();
    }
    @JavascriptInterface
    public void get_udid(){
        mJavaScriptCallBack.get_udid();
    }
    @JavascriptInterface
    public void play_sound(final int soundCode){
        mJavaScriptCallBack.play_sound(soundCode);
    }
    @JavascriptInterface
    public void send_msg(String msg, String phoneNumber){
        mJavaScriptCallBack.send_msg(msg, phoneNumber);
    }
    @JavascriptInterface
    public void send_call(String phoneNumber){
        mJavaScriptCallBack.send_call(phoneNumber);
    }
}
