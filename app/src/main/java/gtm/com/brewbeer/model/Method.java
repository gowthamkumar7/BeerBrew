
package gtm.com.brewbeer.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Method {

    @SerializedName("fermentation")
    private Fermentation mFermentation;
    @SerializedName("mash_temp")
    private List<MashTemp> mMashTemp;
    @SerializedName("twist")
    private Object mTwist;

    public Fermentation getFermentation() {
        return mFermentation;
    }

    public void setFermentation(Fermentation fermentation) {
        mFermentation = fermentation;
    }

    public List<MashTemp> getMashTemp() {
        return mMashTemp;
    }

    public void setMashTemp(List<MashTemp> mashTemp) {
        mMashTemp = mashTemp;
    }

    public Object getTwist() {
        return mTwist;
    }

    public void setTwist(Object twist) {
        mTwist = twist;
    }

}
