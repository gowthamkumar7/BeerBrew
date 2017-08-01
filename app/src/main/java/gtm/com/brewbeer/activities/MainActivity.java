package gtm.com.brewbeer.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.List;

import gtm.com.brewbeer.R;
import gtm.com.brewbeer.adapters.BeerItemAdapter;
import gtm.com.brewbeer.api.ApiService;
import gtm.com.brewbeer.api.NetworkBuilder;
import gtm.com.brewbeer.databinding.ActivityMainBinding;
import gtm.com.brewbeer.model.BeerModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    private BeerItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_main);

        ApiService apiService = NetworkBuilder.getNetworkBuilderInstance().create(ApiService.class);

        apiService.getRandomBeers().enqueue(new Callback<List<BeerModel>>() {
            @Override
            public void onResponse(@NonNull Call<List<BeerModel>> call, @NonNull Response<List<BeerModel>> response) {
                adapter = new BeerItemAdapter(response.body());
                StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
                binding.included.rcvBeers.setLayoutManager(staggeredGridLayoutManager);
                binding.included.rcvBeers.setAdapter(adapter);
            }

            @Override
            public void onFailure(@NonNull Call<List<BeerModel>> call, @NonNull Throwable t) {
                Timber.e("" + t.getMessage());
            }
        });
    }
}
