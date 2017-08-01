
package gtm.com.brewbeer.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

@SuppressWarnings("unused")
public class BeerModel {

    @SerializedName("abv")
    private Double mAbv;
    @SerializedName("attenuation_level")
    private Float mAttenuationLevel;
    @SerializedName("boil_volume")
    private BoilVolume mBoilVolume;
    @SerializedName("brewers_tips")
    private String mBrewersTips;
    @SerializedName("contributed_by")
    private String mContributedBy;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("ebc")
    private Float mEbc;
    @SerializedName("first_brewed")
    private String mFirstBrewed;
    @SerializedName("food_pairing")
    private List<String> mFoodPairing;
    @SerializedName("ibu")
    private Float mIbu;
    @SerializedName("id")
    private Float mId;
    @SerializedName("image_url")
    private String mImageUrl;
    @SerializedName("ingredients")
    private Ingredients mIngredients;
    @SerializedName("method")
    private Method mMethod;
    @SerializedName("name")
    private String mName;
    @SerializedName("ph")
    private Double mPh;
    @SerializedName("srm")
    private Float mSrm;
    @SerializedName("tagline")
    private String mTagline;
    @SerializedName("target_fg")
    private Float mTargetFg;
    @SerializedName("target_og")
    private Float mTargetOg;
    @SerializedName("volume")
    private Volume mVolume;

    public Double getAbv() {
        return mAbv;
    }

    public void setAbv(Double abv) {
        mAbv = abv;
    }

    public Float getAttenuationLevel() {
        return mAttenuationLevel;
    }

    public void setAttenuationLevel(Float attenuationLevel) {
        mAttenuationLevel = attenuationLevel;
    }

    public BoilVolume getBoilVolume() {
        return mBoilVolume;
    }

    public void setBoilVolume(BoilVolume boilVolume) {
        mBoilVolume = boilVolume;
    }

    public String getBrewersTips() {
        return mBrewersTips;
    }

    public void setBrewersTips(String brewersTips) {
        mBrewersTips = brewersTips;
    }

    public String getContributedBy() {
        return mContributedBy;
    }

    public void setContributedBy(String contributedBy) {
        mContributedBy = contributedBy;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public Float getEbc() {
        return mEbc;
    }

    public void setEbc(Float ebc) {
        mEbc = ebc;
    }

    public String getFirstBrewed() {
        return mFirstBrewed;
    }

    public void setFirstBrewed(String firstBrewed) {
        mFirstBrewed = firstBrewed;
    }

    public List<String> getFoodPairing() {
        return mFoodPairing;
    }

    public void setFoodPairing(List<String> foodPairing) {
        mFoodPairing = foodPairing;
    }

    public Float getIbu() {
        return mIbu;
    }

    public void setIbu(Float ibu) {
        mIbu = ibu;
    }

    public Float getId() {
        return mId;
    }

    public void setId(Float id) {
        mId = id;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }

    public Ingredients getIngredients() {
        return mIngredients;
    }

    public void setIngredients(Ingredients ingredients) {
        mIngredients = ingredients;
    }

    public Method getMethod() {
        return mMethod;
    }

    public void setMethod(Method method) {
        mMethod = method;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public Double getPh() {
        return mPh;
    }

    public void setPh(Double ph) {
        mPh = ph;
    }

    public Float getSrm() {
        return mSrm;
    }

    public void setSrm(Float srm) {
        mSrm = srm;
    }

    public String getTagline() {
        return mTagline;
    }

    public void setTagline(String tagline) {
        mTagline = tagline;
    }

    public Float getTargetFg() {
        return mTargetFg;
    }

    public void setTargetFg(Float targetFg) {
        mTargetFg = targetFg;
    }

    public Float getTargetOg() {
        return mTargetOg;
    }

    public void setTargetOg(Float targetOg) {
        mTargetOg = targetOg;
    }

    public Volume getVolume() {
        return mVolume;
    }

    public void setVolume(Volume volume) {
        mVolume = volume;
    }

}
