package com.example.zhangyx1.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zhangyx1 on 2017/8/23.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;
    public int getId(){return id;}
    public void setId(){this.id=id;}
    public String getProvinceName(){return provinceName;}
    public void setProvinceName(String provinceName){this.provinceName=provinceName;}
    public int getProvinceCode(){return provinceCode;}
    public void setProvinceCode(int provinceCode){this.provinceCode=provinceCode;}

}
