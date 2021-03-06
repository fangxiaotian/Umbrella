package com.aouyu.apps.weather.bean;

import java.io.Serializable;

/**
 * 外出建议
 * Created by fangxiaotian on 2016/12/23.
 */

public class TravBean implements Serializable {

    /**
     * brf : 适宜
     * txt : 天气较好，风稍大，但温度适宜，是个好天气哦。适宜旅游，您可以尽情地享受大自然的无限风光。
     */

    private String brf;
    private String txt;

    public String getBrf() {
        return brf;
    }

    public void setBrf(String brf) {
        this.brf = brf;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    @Override
    public String toString() {
        return "TravBean{" +
                "brf='" + brf + '\'' +
                ", txt='" + txt + '\'' +
                '}';
    }
}
