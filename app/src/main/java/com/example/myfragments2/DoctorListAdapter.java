package com.example.myfragments2;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Random;

public class DoctorListAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    private Random random;

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new RecyclerViewHolder(view);
    }

    /**
     * Binding each element with data
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.bindView(position);
    }

//    @Override
//    public int getItemViewType(int position) {
//        return R.layout.list_item;
//    }

    @Override
    public int getItemCount() {
        return AppointmntData.Docname.length;
    }
}
