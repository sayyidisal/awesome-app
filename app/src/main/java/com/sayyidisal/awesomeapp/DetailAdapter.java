package com.sayyidisal.awesomeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/**
 * Created by Sayyid Shalahuddin on 9/23/2021.
 */
public class DetailAdapter extends RecyclerView.Adapter<DetailViewHolder>  {
    private Context context;
    List<DetailModel> detailModelList;
    public DetailAdapter(List<DetailModel> detailModelList) {
        this.detailModelList = detailModelList;
    }

    @Override
    public DetailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.detalil_item,parent,false);
        return new DetailViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DetailViewHolder holder, final int position) {

        DetailModel detail = detailModelList.get(position);
        holder.photograph.setText(detail.getTitle());
        holder.photograph_url.setText(detail.getPetunjuk());

    }

    @Override
    public int getItemCount() {
        return detailModelList.size();
    }
}
class DetailViewHolder extends RecyclerView.ViewHolder{
    TextView photograph, photograph_url;
    public DetailViewHolder(@NonNull View itemView) {
        super(itemView);
        photograph = itemView.findViewById(R.id.photographer);
        photograph_url = itemView.findViewById(R.id.photograph_url);
    }
}