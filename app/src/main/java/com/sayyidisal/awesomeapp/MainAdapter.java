package com.sayyidisal.awesomeapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Sayyid Shalahuddin on 9/22/2021.
 */
public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

    private Context context;
    private List<MainModel> mainModelList;

    public MainAdapter(Context context, List<MainModel> mainModelList) {
        this.context = context;
        this.mainModelList = mainModelList;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.image_item,parent,false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, final int position) {

        Glide.with(context).load(mainModelList.get(position).getMediumUrl()).into(holder.imageView);
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, DetailScreen.class)
                        .putExtra("originalUrl", mainModelList.get(position).getOriginalUrl())
                        .putExtra("photographer", mainModelList.get(position).getPhotographer())
                        .putExtra("photographer_url", mainModelList.get(position).getPhotographer_url())
                        .putExtra("mediumUrl", mainModelList.get(position).getMediumUrl())
                        .putExtra("smallUrl", mainModelList.get(position).getSmallUrl())
                );
            }
        });
    }

    @Override
    public int getItemCount() {
        return mainModelList.size();
    }
}
class MainViewHolder extends RecyclerView.ViewHolder{
    ImageView imageView;
    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView=itemView.findViewById(R.id.imageViewItem);
    }
}