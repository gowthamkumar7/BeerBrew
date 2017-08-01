
package gtm.com.brewbeer.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class MashTemp {

    @SerializedName("duration")
    private Long mDuration;
    @SerializedName("temp")
    private Temp mTemp;

    public Long getDuration() {
        return mDuration;
    }

    public void setDuration(Long duration) {
        mDuration = duration;
    }

    public Temp getTemp() {
        return mTemp;
    }

    public void setTemp(Temp temp) {
        mTemp = temp;
    }

}
