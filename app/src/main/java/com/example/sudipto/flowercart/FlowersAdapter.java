package com.example.sudipto.flowercart;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sudipto on 4/17/2017.
 */

public class FlowersAdapter extends RecyclerView.Adapter<FlowersAdapter.MyViewHolder> {



    private List<Flower>flowersList;

    public FlowersAdapter(List<Flower>flowersList){
        this.flowersList = flowersList;

    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }




    @Override
    public FlowersAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.flower_list_row, parent, false);

        MyViewHolder myViewHolder = new MyViewHolder(itemView);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(FlowersAdapter.MyViewHolder holder, int position) {

        holder.flower_name.setText(flowersList.get(position).name);
        holder.flower_price.setText(flowersList.get(position).price);
        holder.flower_photo.setText(flowersList.get(position).photo);



    }

    @Override
    public int getItemCount() {

        return this.flowersList.size();

    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView flower_name,flower_price,flower_photo;

        public MyViewHolder(View itemView) {
            super(itemView);

            flower_name = (TextView)itemView.findViewById(R.id.tv_flower_name);
            flower_price = (TextView)itemView.findViewById(R.id.tv_flower_price);
            flower_photo = (TextView)itemView.findViewById(R.id.tv_flower_image);

        }
    }
}
