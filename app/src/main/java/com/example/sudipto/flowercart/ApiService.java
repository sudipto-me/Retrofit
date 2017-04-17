package com.example.sudipto.flowercart;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by sudipto on 4/17/2017.
 */

public interface ApiService {

    @GET("flowers.json")
    Call<List<Flower>> getMyJSON();

}
