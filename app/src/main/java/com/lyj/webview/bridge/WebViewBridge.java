package com.lyj.webview.bridge;

import android.webkit.JavascriptInterface;

import com.lyj.webview.model.JavaScriptCallBack;

public class WebViewBridge {

    private JavaScriptCallBack mJavaScriptCallBack;

    public WebViewBridge(JavaScriptCallBack javaScriptCallBack){
        this.mJavaScriptCallBack = javaScriptCallBack;
    }

    /**
     * 앱 종류.
     */
    @JavascriptInterface
    public void app_close(){
        mJavaScriptCallBack.app_close();
    }

    /**
     * Dialog 뛰우기
     * @param msg
     * @param functionName
     */
    @JavascriptInterface
    public void os_dial(final String msg, final String functionName){
        mJavaScriptCallBack.os_dial(msg, functionName);
    }

    /**
     * 뷰패이지로 이동
     * @param url
     * @param msg
     */
    @JavascriptInterface
    public void go_view(final String url, String msg){
        mJavaScriptCallBack.go_view(url, msg);
    }

    /**
     * 로그인 아이디를 저장
     * @param loginID
     */
    @JavascriptInterface
    public void member_set(String loginID){
        mJavaScriptCallBack.member_set(loginID);
    }

    /**
     * 로그인 아이디를 리턴
     */
    @JavascriptInterface
    public void member_get(){
        mJavaScriptCallBack.member_get();
    }

    /**
     * 로그아웃
     */
    @JavascriptInterface
    public void logout(){
        mJavaScriptCallBack.logout();
    }

    /**
     * 현재 위치
     */
    @JavascriptInterface
    public void get_now_position(){
        mJavaScriptCallBack.get_now_position();
    }

    /**
     * 유니크 아이디 리턴
     */
    @JavascriptInterface
    public void get_udid(){
        mJavaScriptCallBack.get_udid();
    }

    /**
     * 사운드 요청
     * @param soundCode
     */
    @JavascriptInterface
    public void play_sound(final int soundCode){
        mJavaScriptCallBack.play_sound(soundCode);
    }

    /**
     * 문자전송
     * @param msg
     * @param phoneNumber
     */
    @JavascriptInterface
    public void send_msg(String msg, String phoneNumber){
        mJavaScriptCallBack.send_msg(msg, phoneNumber);
    }

    /**
     * 전화걸기
     * @param phoneNumber
     */
    @JavascriptInterface
    public void send_call(String phoneNumber){
        mJavaScriptCallBack.send_call(phoneNumber);
    }


    /**
     * 결제 및 요청 취소
     * @param type
     * @param tid
     * @param amount
     * @param tax
     * @param tip
     * @param installment
     * @param approvalNum
     * @param approvalDate
     * @param phoneNumber
     */
    @JavascriptInterface
    public void payment(String type, String tid, String amount, String tax, String tip, String installment, String approvalNum, String approvalDate, String phoneNumber){
        mJavaScriptCallBack.payment(type, tid, amount, tax, tip, installment, approvalNum, approvalDate, phoneNumber);
    }

    /**
     * 결제 결과 리턴
     */
    @JavascriptInterface
    public void payment_result(){
        mJavaScriptCallBack.payment_result();
    }
}
