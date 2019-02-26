
package ru.startandroid.myapplication2.geocoder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BoundedBy_ {

    @SerializedName("Envelope")
    @Expose
    private Envelope_ envelope;

    public Envelope_ getEnvelope() {
        return envelope;
    }

    public void setEnvelope(Envelope_ envelope) {
        this.envelope = envelope;
    }

}
