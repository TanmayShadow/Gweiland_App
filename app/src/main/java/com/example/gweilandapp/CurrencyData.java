package com.example.gweilandapp;

public class CurrencyData {
    private String cmc_rank;
    private String id;
    private String name;
    private String percent_change_24h;
    private String price;
    private String symbol;

    public CurrencyData(String cmc_rank, String id, String name, String percent_change_24h, String price, String symbol) {
        this.cmc_rank = cmc_rank;
        this.id = id;
        this.name = name;
        this.percent_change_24h = percent_change_24h;
        this.price = price;
        this.symbol = symbol;
    }

    public String getCmc_rank() {
        return cmc_rank;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPercent_change_24h() {
        return percent_change_24h;
    }

    public String getPrice() {
        return price;
    }

    public String getSymbol() {
        return symbol;
    }
}
