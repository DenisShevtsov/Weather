
package ru.startandroid.myapplication2.weather;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Weather {

    @SerializedName("now")
    @Expose
    private Integer now;
    @SerializedName("now_dt")
    @Expose
    private String nowDt;
    @SerializedName("info")
    @Expose
    private Info info;
    @SerializedName("fact")
    @Expose
    private Fact fact;
    @SerializedName("forecasts")
    @Expose
    private List<Forecast> forecasts = null;

    public Integer getNow() {
        return now;
    }

    public void setNow(Integer now) {
        this.now = now;
    }

    public String getNowDt() {
        return nowDt;
    }

    public void setNowDt(String nowDt) {
        this.nowDt = nowDt;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public Fact getFact() {
        return fact;
    }

    public void setFact(Fact fact) {
        this.fact = fact;
    }

    public List<Forecast> getForecasts() {
        return forecasts;
    }

    public void setForecasts(List<Forecast> forecasts) {
        this.forecasts = forecasts;
    }

}
