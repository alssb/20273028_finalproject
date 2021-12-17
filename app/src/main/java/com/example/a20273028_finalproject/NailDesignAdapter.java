package com.example.a20273028_finalproject;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class NailDesignAdapter extends RecyclerView.Adapter<NailDesignAdapter.ViewHolder>{
    ArrayList<NailDesign> items = new ArrayList<NailDesign>();
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.design_item, viewGroup, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewholder, int position) {
        NailDesign item = items.get(position);
        viewholder.setItem(item);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView textView;

        public ViewHolder(View itemView)
        {
            super(itemView);
            textView= itemView.findViewById(R.id.xnametext);

        }
        public void setItem(NailDesign item){
            textView.setText(item.getName());
        }
    }
    public void addItem(NailDesign item)
    {
        items.add(item);
    }
    public void setItems(ArrayList<NailDesign> items)
    {
        this.items = items;
    }
}
