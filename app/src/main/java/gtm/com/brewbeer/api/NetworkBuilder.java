package gtm.com.brewbeer.api;

import gtm.com.brewbeer.utils.Constants;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by P R Gowtham kumar on 6/30/2017.
 */

public class NetworkBuilder {

    /**
     * SingleTon class to provide single retrofit instance.
     */

    private static Retrofit RETROFIT;

    private NetworkBuilder() {
    }

    public synchronized static Retrofit getNetworkBuilderInstance() {
        if (RETROFIT == null) {
            RETROFIT = new Retrofit.Builder()
                    .baseUrl(Constants.BASE_URL).addConverterFactory(GsonConverterFactory.create())
                    .build();
        } else {
            return RETROFIT;
        }
        return RETROFIT;
    }


}
