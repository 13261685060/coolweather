package com.m520it.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author Administrator
 * @version $Rev$
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDes ${TODO}
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    private class More {
        @SerializedName("txt")
        public String info;
    }
}
