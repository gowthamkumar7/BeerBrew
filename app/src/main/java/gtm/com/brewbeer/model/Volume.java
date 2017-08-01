
package gtm.com.brewbeer.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Volume {

    @SerializedName("unit")
    private String mUnit;
    @SerializedName("value")
    private Long mValue;

    public String getUnit() {
        return mUnit;
    }

    public void setUnit(String unit) {
        mUnit = unit;
    }

    public Long getValue() {
        return mValue;
    }

    public void setValue(Long value) {
        mValue = value;
    }

}
