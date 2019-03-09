
package ru.startandroid.weath.weather;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Forecast {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("date_ts")
    @Expose
    private Integer dateTs;
    @SerializedName("week")
    @Expose
    private Integer week;
    @SerializedName("sunrise")
    @Expose
    private String sunrise;
    @SerializedName("sunset")
    @Expose
    private String sunset;
    @SerializedName("rise_begin")
    @Expose
    private String riseBegin;
    @SerializedName("set_end")
    @Expose
    private String setEnd;
    @SerializedName("moon_code")
    @Expose
    private Integer moonCode;
    @SerializedName("moon_text")
    @Expose
    private String moonText;
    @SerializedName("parts")
    @Expose
    private Parts parts;
    @SerializedName("hours")
    @Expose
    private List<Hour> hours = null;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getDateTs() {
        return dateTs;
    }

    public void setDateTs(Integer dateTs) {
        this.dateTs = dateTs;
    }

    public Integer getWeek() {
        return week;
    }

    public void setWeek(Integer week) {
        this.week = week;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public String getRiseBegin() {
        return riseBegin;
    }

    public void setRiseBegin(String riseBegin) {
        this.riseBegin = riseBegin;
    }

    public String getSetEnd() {
        return setEnd;
    }

    public void setSetEnd(String setEnd) {
        this.setEnd = setEnd;
    }

    public Integer getMoonCode() {
        return moonCode;
    }

    public void setMoonCode(Integer moonCode) {
        this.moonCode = moonCode;
    }

    public String getMoonText() {
        return moonText;
    }

    public void setMoonText(String moonText) {
        this.moonText = moonText;
    }

    public Parts getParts() {
        return parts;
    }

    public void setParts(Parts parts) {
        this.parts = parts;
    }

    public List<Hour> getHours() {
        return hours;
    }

    public void setHours(List<Hour> hours) {
        this.hours = hours;
    }

}
