package com.example.gweilandapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CurrencyAdapter extends RecyclerView.Adapter<CurrencyAdapter.ViewHolder> {

    private List<CurrencyData> currencyData;

    public CurrencyAdapter(List<CurrencyData> currencyData) {
        this.currencyData = currencyData;
    }

    @NonNull
    @Override
    public CurrencyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CurrencyAdapter.ViewHolder holder, int position) {
        holder.currencyShortName.setText(currencyData.get(position).getSymbol());
        holder.currencyName.setText(currencyData.get(position).getName());
        holder.currencyPrice.setText(currencyData.get(position).getPrice());
        holder.currencyPercentage.setText(currencyData.get(position).getPercent_change_24h());
    }

    @Override
    public int getItemCount() {
        return currencyData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView currencyShortName;
        TextView currencyName;
        TextView currencyPrice;
        TextView currencyPercentage;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            currencyShortName = itemView.findViewById(R.id.currencyShortName);
            currencyName = itemView.findViewById(R.id.currencyName);
            currencyPrice = itemView.findViewById(R.id.currencyPrice);
            currencyPercentage = itemView.findViewById(R.id.currencyPercentage);
        }
    }
}
