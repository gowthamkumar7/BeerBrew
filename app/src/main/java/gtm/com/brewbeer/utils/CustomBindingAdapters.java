package gtm.com.brewbeer.utils;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import gtm.com.brewbeer.BrewBeerApplication;

/**
 * Created by P R Gowtham kumar on 7/5/2017.
 */

public class CustomBindingAdapters {

    @BindingAdapter("bottlebrandImageUrl")
    public static void setBottleBrandImageUrl(ImageView imageView, String url) {
        Picasso.with(BrewBeerApplication.getAppContext()).load(url).into(imageView);
    }

}
