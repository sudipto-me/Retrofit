package com.example.sudipto.flowercart;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by sudipto on 4/17/2017.
 */

public class RetroClient {


    public static final String BASE_URL = "http://services.hanselandpetal.com/feeds/";

    private static Retrofit retrofit = null;

    public static Retrofit getClient(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;

    }

}
