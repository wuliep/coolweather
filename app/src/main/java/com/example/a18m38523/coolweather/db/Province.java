package com.example.a18m38523.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 项目名称：CoolWeather
 * 创建人：${user}
 * 创建时间：2018/8/28  11:24
 */
public class Province extends DataSupport {

    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
