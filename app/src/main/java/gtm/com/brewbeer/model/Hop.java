
package gtm.com.brewbeer.model;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Hop {

    @SerializedName("add")
    private String mAdd;
    @SerializedName("amount")
    private Amount mAmount;
    @SerializedName("attribute")
    private String mAttribute;
    @SerializedName("name")
    private String mName;

    public String getAdd() {
        return mAdd;
    }

    public void setAdd(String add) {
        mAdd = add;
    }

    public Amount getAmount() {
        return mAmount;
    }

    public void setAmount(Amount amount) {
        mAmount = amount;
    }

    public String getAttribute() {
        return mAttribute;
    }

    public void setAttribute(String attribute) {
        mAttribute = attribute;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

}
