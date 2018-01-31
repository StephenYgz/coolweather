package com.demo.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by ygz on 2018/1/31.
 */

public class HttpUtil {

    /**
     * 发起一条http请求
     *
     * @param address  请求地址
     * @param callback 请求结果回调
     */
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        okHttpClient.newCall(request).enqueue(callback);
    }
}
