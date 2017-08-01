package gtm.com.brewbeer.adapters;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import gtm.com.brewbeer.R;
import gtm.com.brewbeer.databinding.ListItemBeerBinding;
import gtm.com.brewbeer.model.BeerModel;

/**
 * Created by P R Gowtham kumar on 7/4/2017.
 */

public class BeerItemAdapter extends RecyclerView.Adapter<BeerItemAdapter.MyViewHolder> {

    private List<BeerModel> modelList;

    @UiThread
    public BeerItemAdapter(@NonNull List<BeerModel> modelList) {
        this.modelList = modelList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ListItemBeerBinding binding = DataBindingUtil.inflate(LayoutInflater.from((parent.getContext())), R.layout.list_item_beer, parent, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        BeerModel beerModel = modelList.get(position);
        holder.binding.setModel(beerModel);


    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        ListItemBeerBinding binding;


        MyViewHolder(ListItemBeerBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}
