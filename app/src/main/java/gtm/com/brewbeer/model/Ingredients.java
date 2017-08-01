
package gtm.com.brewbeer.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Ingredients {

    @SerializedName("hops")
    private List<Hop> mHops;
    @SerializedName("malt")
    private List<Malt> mMalt;
    @SerializedName("yeast")
    private String mYeast;

    public List<Hop> getHops() {
        return mHops;
    }

    public void setHops(List<Hop> hops) {
        mHops = hops;
    }

    public List<Malt> getMalt() {
        return mMalt;
    }

    public void setMalt(List<Malt> malt) {
        mMalt = malt;
    }

    public String getYeast() {
        return mYeast;
    }

    public void setYeast(String yeast) {
        mYeast = yeast;
    }

}
