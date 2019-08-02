package com.lyj.webview.model;

public interface JavaScriptCallBack {


     void app_close();
     void os_dial(final String msg, final String functionName);
     void go_view(final String url, String msg);
     void member_set(String loginID);
     void member_get();
     void logout();
     void get_now_position();
     void get_udid();
     void play_sound(final int soundCode);
     void send_msg(final String msg, final String phoneNumber);
     void send_call(final String phoneNumber);

}
