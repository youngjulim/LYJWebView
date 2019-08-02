package com.lyj.webview.model;


public abstract class JavaScriptCallBack {

     public void app_close(){}
     public void os_dial(final String msg, final String functionName){}
     public void go_view(final String url, String msg){}
     public void member_set(String loginID){}
     public void member_get(){}
     public void logout(){}
     public void get_now_position(){}
     public void get_udid(){}
     public void play_sound(final int soundCode){}
     public void send_msg(final String msg, final String phoneNumber){}
     public void send_call(final String phoneNumber){}
     public void payment(String type, String amount, String tax, String v, String productName, String approvalNum, String customerName, String phoneNumber, String tid, String installement){}
     public void payment_result(){}

}
