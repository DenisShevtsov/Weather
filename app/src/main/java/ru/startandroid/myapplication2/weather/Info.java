
package ru.startandroid.myapplication2.weather;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Info {

    @SerializedName("f")
    @Expose
    private Boolean f;
    @SerializedName("n")
    @Expose
    private Boolean n;
    @SerializedName("nr")
    @Expose
    private Boolean nr;
    @SerializedName("ns")
    @Expose
    private Boolean ns;
    @SerializedName("nsr")
    @Expose
    private Boolean nsr;
    @SerializedName("p")
    @Expose
    private Boolean p;
    @SerializedName("lat")
    @Expose
    private Double lat;
    @SerializedName("lon")
    @Expose
    private Double lon;
    @SerializedName("tzinfo")
    @Expose
    private Tzinfo tzinfo;
    @SerializedName("def_pressure_mm")
    @Expose
    private Integer defPressureMm;
    @SerializedName("def_pressure_pa")
    @Expose
    private Integer defPressurePa;
    @SerializedName("_h")
    @Expose
    private Boolean h;
    @SerializedName("url")
    @Expose
    private String url;

    public Boolean getF() {
        return f;
    }

    public void setF(Boolean f) {
        this.f = f;
    }

    public Boolean getN() {
        return n;
    }

    public void setN(Boolean n) {
        this.n = n;
    }

    public Boolean getNr() {
        return nr;
    }

    public void setNr(Boolean nr) {
        this.nr = nr;
    }

    public Boolean getNs() {
        return ns;
    }

    public void setNs(Boolean ns) {
        this.ns = ns;
    }

    public Boolean getNsr() {
        return nsr;
    }

    public void setNsr(Boolean nsr) {
        this.nsr = nsr;
    }

    public Boolean getP() {
        return p;
    }

    public void setP(Boolean p) {
        this.p = p;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Tzinfo getTzinfo() {
        return tzinfo;
    }

    public void setTzinfo(Tzinfo tzinfo) {
        this.tzinfo = tzinfo;
    }

    public Integer getDefPressureMm() {
        return defPressureMm;
    }

    public void setDefPressureMm(Integer defPressureMm) {
        this.defPressureMm = defPressureMm;
    }

    public Integer getDefPressurePa() {
        return defPressurePa;
    }

    public void setDefPressurePa(Integer defPressurePa) {
        this.defPressurePa = defPressurePa;
    }

    public Boolean getH() {
        return h;
    }

    public void setH(Boolean h) {
        this.h = h;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
