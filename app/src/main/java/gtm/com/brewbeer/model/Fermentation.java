
package gtm.com.brewbeer.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Fermentation {

    @SerializedName("temp")
    private Temp mTemp;

    public Temp getTemp() {
        return mTemp;
    }

    public void setTemp(Temp temp) {
        mTemp = temp;
    }

}
