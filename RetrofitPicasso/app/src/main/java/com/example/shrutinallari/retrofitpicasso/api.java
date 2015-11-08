package com.example.shrutinallari.retrofitpicasso;


import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;


public interface api {

    @GET("/feeds/flowers.json")
    public void getData(Callback<List<Flower>> response);


}