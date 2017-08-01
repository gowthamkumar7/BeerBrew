
package gtm.com.brewbeer.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Malt {

    @SerializedName("amount")
    private Amount mAmount;
    @SerializedName("name")
    private String mName;

    public Amount getAmount() {
        return mAmount;
    }

    public void setAmount(Amount amount) {
        mAmount = amount;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

}
