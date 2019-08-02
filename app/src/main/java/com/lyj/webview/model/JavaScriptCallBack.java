package com.lyj.webview.model;


public abstract class JavaScriptCallBack {

     //TR_TYPE:거래구분, TID:, TOTAL_AMOUNT:총결제금액, TAX:부가세금액, TIP:봉사료금액, INSTALLMENT:할부유무(default:”00”), APPROVAL_NUM:취소 거래시(승인번호), APPROVAL_DATE:취소거래시, TR_REQ_PHONE:전화번호
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
     public void payment(String type, String tid, String amount, String tax, String tip, String installment, String approvalNum, String approvalDate, String phoneNumber){}
     public void payment_result(){}

}
