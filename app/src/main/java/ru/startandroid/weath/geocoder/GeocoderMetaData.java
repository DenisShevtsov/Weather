
package ru.startandroid.weath.geocoder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GeocoderMetaData {

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("precision")
    @Expose
    private String precision;
    @SerializedName("Address")
    @Expose
    private Address address;
    @SerializedName("AddressDetails")
    @Expose
    private AddressDetails addressDetails;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPrecision() {
        return precision;
    }

    public void setPrecision(String precision) {
        this.precision = precision;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public AddressDetails getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(AddressDetails addressDetails) {
        this.addressDetails = addressDetails;
    }

}
