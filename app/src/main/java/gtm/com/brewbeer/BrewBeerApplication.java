package gtm.com.brewbeer;

import android.app.Application;
import android.content.Context;

import timber.log.Timber;

/**
 * Created by P R Gowtham kumar on 7/4/2017.
 */

public class BrewBeerApplication extends Application {
    private static Context context;


    @Override
    public void onCreate() {
        super.onCreate();
        BrewBeerApplication.context = getApplicationContext();
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }

    }

    public static Context getAppContext() {
        return BrewBeerApplication.context;
    }
}
