package com.example.gweilandapp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.converter.gson.GsonConverterFactory;

public class Retrofit {
    private static String BASE_URL="https://shadow01.pythonanywhere.com/";
    static Gson gson = new GsonBuilder().setLenient().create();


    private static retrofit2.Retrofit retrofit;

    public static retrofit2.Retrofit getRetrofit()
    {
        if(retrofit==null)
        {
            retrofit=new retrofit2.Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create(gson)).build();
        }
        return retrofit;
    }

}
