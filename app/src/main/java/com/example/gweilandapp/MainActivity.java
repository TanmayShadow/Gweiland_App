package com.example.gweilandapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProgressBar progressBar;
    List<MyModel.Datum> currencyList;
    recycleAdapter adapter;

    LinearLayout filterLayout;
    AppCompatButton pbutton,vbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.currencyRecyclerView);
        progressBar = findViewById(R.id.progressBar);

        listingData();

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);

        recyclerView.setLayoutManager(layoutManager);

        pbutton = findViewById(R.id.Price);
        vbutton = findViewById(R.id.Volume);


    }

    private void listingData()
    {
        ApiInterface apiInterface = Retrofit.getRetrofit().create(ApiInterface.class);
        Call<MyModel> listingData = apiInterface.getData();
        listingData.enqueue(new Callback<MyModel>() {
            @Override
            public void onResponse(Call<MyModel> call, Response<MyModel> response) {
                if(response.isSuccessful())
                {
                        adapter = new recycleAdapter(response.body().getData());
                        recyclerView.setAdapter(adapter);
                        progressBar.setVisibility(View.GONE);
                }
            }

            @Override
            public void onFailure(Call<MyModel> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"Failure: "+t.getMessage(),Toast.LENGTH_LONG).show();
                progressBar.setVisibility(View.GONE);
            }
        });
    }

    class recycleAdapter extends RecyclerView.Adapter<recycleAdapter.MyViewHolder>
    {
        List<MyModel.Datum> list;

        public recycleAdapter(List<MyModel.Datum> list) {
            this.list = list;
            currencyList=list;
        }

        @NonNull
        @Override
        public recycleAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,null);

            recycleAdapter.MyViewHolder viewHolder = new recycleAdapter.MyViewHolder(view);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(@NonNull recycleAdapter.MyViewHolder holder, int position) {
            DecimalFormat df = new DecimalFormat("#.##");
            Double percentage24Hr = currencyList.get(position).getQuote().getUsd().getPercentChange24h();
            Double price = currencyList.get(position).getQuote().getUsd().getPrice();
            String percentage = df.format(percentage24Hr);
            String priceFormatted = df.format(price);
            holder.currencyShortName.setText(currencyList.get(position).getSymbol());
            holder.currencyName.setText(currencyList.get(position).getName());
            holder.currencyPrice.setText(priceFormatted);
            holder.currencyPercentage.setText(percentage+"%");

            if(percentage24Hr>0)
            {
                holder.currencyChange.setImageResource(R.drawable.positive);
                holder.currencyPercentage.setTextColor(Color.argb(100,0,255,0));
            }

            String image = "https://s2.coinmarketcap.com/static/img/coins/64x64/"+currencyList.get(position).getId()+".png";
            Picasso.with(getApplicationContext()).load(image).placeholder(R.drawable.sample_logo).fit().into(holder.currencyLogo);

        }

        @Override
        public int getItemCount() {
            if(currencyList!=null)
                return currencyList.size();
            return 0;
        }

        class MyViewHolder extends RecyclerView.ViewHolder
        {
            TextView currencyShortName;
            TextView currencyName;
            TextView currencyPrice;
            TextView currencyPercentage;
            ImageView currencyLogo;
            ImageView currencyChange;

            public MyViewHolder(@NonNull View itemView) {
                super(itemView);
                currencyShortName = itemView.findViewById(R.id.currencyShortName);
                currencyName = itemView.findViewById(R.id.currencyName);
                currencyPrice = itemView.findViewById(R.id.currencyPrice);
                currencyPercentage = itemView.findViewById(R.id.currencyPercentage);
                currencyLogo = itemView.findViewById(R.id. currencyLogo);
                currencyChange = itemView.findViewById(R.id.currencyChange);
            }
        }
    }
    class CurrencyComparator implements java.util.Comparator<MyModel.Datum> {
        @Override
        public int compare(MyModel.Datum a, MyModel.Datum b) {
            return  Double.compare(a.getQuote().getUsd().getPrice() , b.getQuote().getUsd().getPrice());
        }
    }

    class CurrencyVolumeComparator implements java.util.Comparator<MyModel.Datum> {
        @Override
        public int compare(MyModel.Datum a, MyModel.Datum b) {
            return  Double.compare(a.getQuote().getUsd().getVolume24h() , b.getQuote().getUsd().getVolume24h());
        }
    }


    public void sortByPrice(View v)
    {
        Collections.sort(currencyList, new CurrencyComparator());
        adapter.notifyDataSetChanged();

        pbutton.setVisibility(View.INVISIBLE);
        vbutton.setVisibility(View.INVISIBLE);
    }

    public void sortByVolume(View v)
    {
        Collections.sort(currencyList, new CurrencyVolumeComparator());
        adapter.notifyDataSetChanged();
        pbutton.setVisibility(View.INVISIBLE);
        vbutton.setVisibility(View.INVISIBLE);
    }

    public void showFilter(View v)
    {
        if(pbutton.getVisibility()!=View.VISIBLE)
        {
            pbutton.setVisibility(View.VISIBLE);
            vbutton.setVisibility(View.VISIBLE);
        }
        else {
            pbutton.setVisibility(View.INVISIBLE);
            vbutton.setVisibility(View.INVISIBLE);
        }
    }



}