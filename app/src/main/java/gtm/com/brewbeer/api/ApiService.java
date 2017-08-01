package gtm.com.brewbeer.api;

import java.util.List;

import gtm.com.brewbeer.model.BeerModel;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by P R Gowtham kumar on 6/30/2017.
 */

public interface ApiService {


    @GET("v2/beers")
    Call<List<BeerModel>> getRandomBeers();

}
