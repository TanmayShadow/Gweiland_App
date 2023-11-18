package com.example.gweilandapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("data")
    Call<MyModel> getData();
}
