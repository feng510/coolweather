package com.example.weifeng.coolweather.util;

/**
 * Created by weifeng on 2015/10/24.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
