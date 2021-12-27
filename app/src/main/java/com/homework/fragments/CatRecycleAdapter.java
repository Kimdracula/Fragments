package com.homework.fragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CatRecycleAdapter extends RecyclerView.Adapter<CatRecycleAdapter.CatViewHolder> {
    private List<Cat> mCatList;

    public CatRecycleAdapter(List<Cat> mCatList) {
        this.mCatList = mCatList;
    }

    @NonNull
    @Override
    public CatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycle_item, parent, false);
        return new CatViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull CatViewHolder holder, int position) {
        Cat cat = mCatList.get(position);
        holder.header.setText(cat.getHeader());
        holder.desc.setText(cat.getDescription());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

  public static class CatViewHolder extends RecyclerView.ViewHolder {
        private final TextView header;
        private TextView desc;

       public CatViewHolder(@NonNull View itemView) {
           super(itemView);
           header = itemView.findViewById(R.id.header_textview);
           desc = itemView.findViewById(R.id.description_textView);
           
           header.setOnClickListener(view -> Toast.makeText(itemView.getContext(), "Кликнулось", Toast.LENGTH_SHORT).show());
       }
   }
   }

