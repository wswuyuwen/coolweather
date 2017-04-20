package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Wu Yuwen on 2017/4/18.
 */

public class Basic {
    /*
    JSON中的一些字段不太适合直接作为Java字段来命名，
    因此使用了 @SerializedName注解的方式来让JSON和Java字段之间建立映射关系
     */
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public  Update update;

    public  class Update{
        @SerializedName("loc")
        public  String updateTime;
    }
}
