package com.example.gweilandapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.currencyRecyclerView);
        progressBar = findViewById(R.id.progressBar);

        listingData();

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);

        recyclerView.setLayoutManager(layoutManager);

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
                        recycleAdapter adapter = new recycleAdapter(response.body().getData());
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
            Double percentage24Hr = list.get(position).getQuote().getUsd().getPercentChange24h();
            Double price = list.get(position).getQuote().getUsd().getPrice();
            String percentage = df.format(percentage24Hr);
            String priceFormatted = df.format(price);
            holder.currencyShortName.setText(list.get(position).getSymbol());
            holder.currencyName.setText(list.get(position).getName());
            holder.currencyPrice.setText(priceFormatted);
            holder.currencyPercentage.setText(percentage+"%");

            if(percentage24Hr>0)
            {
                holder.currencyChange.setImageResource(R.drawable.positive);
                holder.currencyPercentage.setTextColor(Color.argb(100,0,255,0));
            }

            String image = "https://s2.coinmarketcap.com/static/img/coins/64x64/"+list.get(position).getId()+".png";
            Picasso.with(getApplicationContext()).load(image).placeholder(R.drawable.sample_logo).fit().into(holder.currencyLogo);

        }

        @Override
        public int getItemCount() {
            if(list!=null)
                return list.size();
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



}