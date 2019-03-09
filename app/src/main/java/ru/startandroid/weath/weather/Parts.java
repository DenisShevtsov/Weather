
package ru.startandroid.weath.weather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Parts {

    @SerializedName("night")
    @Expose
    private Night night;
    @SerializedName("morning")
    @Expose
    private Morning morning;
    @SerializedName("day")
    @Expose
    private Day day;
    @SerializedName("evening")
    @Expose
    private Evening evening;
    @SerializedName("day_short")
    @Expose
    private DayShort dayShort;
    @SerializedName("night_short")
    @Expose
    private NightShort nightShort;

    public Night getNight() {
        return night;
    }

    public void setNight(Night night) {
        this.night = night;
    }

    public Morning getMorning() {
        return morning;
    }

    public void setMorning(Morning morning) {
        this.morning = morning;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public Evening getEvening() {
        return evening;
    }

    public void setEvening(Evening evening) {
        this.evening = evening;
    }

    public DayShort getDayShort() {
        return dayShort;
    }

    public void setDayShort(DayShort dayShort) {
        this.dayShort = dayShort;
    }

    public NightShort getNightShort() {
        return nightShort;
    }

    public void setNightShort(NightShort nightShort) {
        this.nightShort = nightShort;
    }

}
