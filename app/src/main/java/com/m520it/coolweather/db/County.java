package com.m520it.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * @author Administrator
 * @version $Rev$
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDes ${TODO}
 */
public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCountyName(){
        return countyName;
    }

    public void setCountyName(String countyName){
        this.countyName = countyName;
    }
    private String getWeatherId(){
        return weatherId;
    }
    public void setWeatherId(String weatherId){
        this.weatherId = weatherId;
    }
    private int getCityId(){
        return cityId;

    }
    public void setCityId(int cityId){
        this.cityId = cityId;
    }

}