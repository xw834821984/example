package com.nazi.latte.ec.pay;

/**
 * Created by nazi
 */

public interface IAlPayResultListener {
    //支付成功
    void onPaySuccess();
    //支付中
    void onPaying();
    //支付失败
    void onPayFail();
    //用户取消
    void onPayCancel();
    //支付异常
    void onPayConnectError();
}
