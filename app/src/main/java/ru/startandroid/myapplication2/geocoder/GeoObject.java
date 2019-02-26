
package ru.startandroid.myapplication2.geocoder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GeoObject {

    @SerializedName("metaDataProperty")
    @Expose
    private MetaDataProperty_ metaDataProperty;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("boundedBy")
    @Expose
    private BoundedBy_ boundedBy;
    @SerializedName("Point")
    @Expose
    private Point point;

    public MetaDataProperty_ getMetaDataProperty() {
        return metaDataProperty;
    }

    public void setMetaDataProperty(MetaDataProperty_ metaDataProperty) {
        this.metaDataProperty = metaDataProperty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BoundedBy_ getBoundedBy() {
        return boundedBy;
    }

    public void setBoundedBy(BoundedBy_ boundedBy) {
        this.boundedBy = boundedBy;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

}
