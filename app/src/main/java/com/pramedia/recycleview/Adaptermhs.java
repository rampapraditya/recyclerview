package com.pramedia.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adaptermhs extends RecyclerView.Adapter<Adaptermhs.MyViewHolder> {

    private ArrayList<Mahasiswa> items;
    private Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView txtNIM, txtNama, txtProdi;

        public MyViewHolder(View view) {
            super(view);
            txtNIM = view.findViewById(R.id.txtNIM);
            txtNama = view.findViewById(R.id.txtNama);
            txtProdi = view.findViewById(R.id.txtProdi);
        }
    }

    public Adaptermhs(ArrayList<Mahasiswa> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_mahasiswa, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        Mahasiswa obj = items.get(position);
        holder.txtNIM.setText(obj.getNim());
        holder.txtNama.setText(obj.getNim());
        holder.txtProdi.setText(obj.getProdi());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
