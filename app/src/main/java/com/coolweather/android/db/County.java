package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Wu Yuwen on 2017/4/17.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;//县的名字
    private String weatherId;//县对应的天气id
    private int cityId;//县所属的市的id
}
