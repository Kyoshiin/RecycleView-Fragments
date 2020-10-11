package com.example.myfragments2;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * For each list item
 */

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    private TextView Docname;
    private TextView time;

    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);

        /**
         * Binding the textview of each element
         */

        Docname = itemView.findViewById(R.id.DocNameview);
        time = itemView.findViewById(R.id.timeview);

    }

    /**
     * To bind the view to our data
     */

    public void bindView(int pos)
    {
        Docname.setText(AppointmntData.Docname[pos]);
        time.setText(AppointmntData.time[pos]);
    }

}
