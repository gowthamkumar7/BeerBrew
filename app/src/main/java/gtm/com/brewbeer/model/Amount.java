
package gtm.com.brewbeer.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Amount {

    @SerializedName("unit")
    private String mUnit;
    @SerializedName("value")
    private Double mValue;

    public String getUnit() {
        return mUnit;
    }

    public void setUnit(String unit) {
        mUnit = unit;
    }

    public Double getValue() {
        return mValue;
    }

    public void setValue(Double value) {
        mValue = value;
    }

}
