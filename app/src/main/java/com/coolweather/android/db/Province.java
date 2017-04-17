package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Wu Yuwen on 2017/4/17.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;//省的名字
    private int provinceCode;//省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}
