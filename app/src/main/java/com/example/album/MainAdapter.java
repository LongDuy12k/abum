package com.example.album;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {
    private List<mainData> mainDataList;

    public MainAdapter(List<mainData> mainDataList) {
        this.mainDataList = mainDataList;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_img,parent,false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        mainData maindata = mainDataList.get(position);
        if (maindata == null){
            return;
        }


        holder.layoutItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickGotoDetal(maindata);
            }
        });
    }

    private void onClickGotoDetal(mainData mainData){
        Intent intent = new Intent();
    }

    @Override
    public int getItemCount() {
        if (mainDataList != null){
            return mainDataList.size();
        }
        return 0;
    }

    public class MainViewHolder extends RecyclerView.ViewHolder{
        private RelativeLayout layoutItem;
        private ImageView img1;
        private TextView tvUseG;
        private TextView tvDate;


        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            layoutItem = itemView.findViewById(R.id.layout_item);
            img1 = itemView.findViewById(R.id.img1);
            tvUseG = itemView.findViewById(R.id.tvUseG);
            tvDate = itemView.findViewById(R.id.tvdate);
        }
    }
}
