
package ru.startandroid.weath.weather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NightShort {

    @SerializedName("temp")
    @Expose
    private Integer temp;
    @SerializedName("feels_like")
    @Expose
    private Integer feelsLike;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("condition")
    @Expose
    private String condition;
    @SerializedName("wind_speed")
    @Expose
    private Double windSpeed;
    @SerializedName("wind_gust")
    @Expose
    private Double windGust;
    @SerializedName("wind_dir")
    @Expose
    private String windDir;
    @SerializedName("pressure_mm")
    @Expose
    private Integer pressureMm;
    @SerializedName("pressure_pa")
    @Expose
    private Integer pressurePa;
    @SerializedName("humidity")
    @Expose
    private Integer humidity;
    @SerializedName("uv_index")
    @Expose
    private Integer uvIndex;
    @SerializedName("soil_temp")
    @Expose
    private Integer soilTemp;
    @SerializedName("soil_moisture")
    @Expose
    private Double soilMoisture;
    @SerializedName("prec_mm")
    @Expose
    private Double precMm;
    @SerializedName("prec_prob")
    @Expose
    private Integer precProb;

    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    public Integer getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(Integer feelsLike) {
        this.feelsLike = feelsLike;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Double getWindGust() {
        return windGust;
    }

    public void setWindGust(Double windGust) {
        this.windGust = windGust;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    public Integer getPressureMm() {
        return pressureMm;
    }

    public void setPressureMm(Integer pressureMm) {
        this.pressureMm = pressureMm;
    }

    public Integer getPressurePa() {
        return pressurePa;
    }

    public void setPressurePa(Integer pressurePa) {
        this.pressurePa = pressurePa;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(Integer uvIndex) {
        this.uvIndex = uvIndex;
    }

    public Integer getSoilTemp() {
        return soilTemp;
    }

    public void setSoilTemp(Integer soilTemp) {
        this.soilTemp = soilTemp;
    }

    public Double getSoilMoisture() {
        return soilMoisture;
    }

    public void setSoilMoisture(Double soilMoisture) {
        this.soilMoisture = soilMoisture;
    }

    public Double getPrecMm() {
        return precMm;
    }

    public void setPrecMm(Double precMm) {
        this.precMm = precMm;
    }

    public Integer getPrecProb() {
        return precProb;
    }

    public void setPrecProb(Integer precProb) {
        this.precProb = precProb;
    }

}
