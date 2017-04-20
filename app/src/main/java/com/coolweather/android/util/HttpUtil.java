package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

import static android.R.string.ok;

/**
 * Created by Wu Yuwen on 2017/4/17.
 */

public class HttpUtil {
    //发起一条Http请求
    public  static  void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request =new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);

    }
}
