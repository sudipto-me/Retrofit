package com.example.sudipto.flowercart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    public LinearLayoutManager linearLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getFlowerList();


    }

    private void getFlowerList(){

        try{

            ApiService service = RetroClient.getClient().create(ApiService.class);

            Call<List<Flower>>call = service.getMyJSON();

            call.enqueue(new Callback<List<Flower>>() {
                @Override
                public void onResponse(Call<List<Flower>> call, Response<List<Flower>> response) {

                    List<Flower> flowerList = response.body();


                    linearLayoutManager = new LinearLayoutManager(MainActivity.this);
                    RecyclerView recyclerView = (RecyclerView)findViewById(R.id.rv_flower_cart);
                    recyclerView.setLayoutManager(linearLayoutManager);



                    FlowersAdapter flowersAdapter = new FlowersAdapter(flowerList);
                    recyclerView.setAdapter(flowersAdapter);
                }

                @Override
                public void onFailure(Call<List<Flower>> call, Throwable t) {

                }
            });


        }catch (Exception e){

        }

    }


}
