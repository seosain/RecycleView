package com.example.uts_angel;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class greeting_adapter extends RecyclerView.Adapter<greeting_adapter.MahasiswaViewHolder> {
    private ArrayList<greeting> dataList;

    public greeting_adapter(ArrayList<greeting> dataList) {
        this.dataList = dataList;
    }

    @Override
    public MahasiswaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.greeting_bahasa, parent, false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MahasiswaViewHolder holder, int position) {
        holder.txtIndonesia.setText(dataList.get(position).getIndonesia());
        holder.txtJepang.setText(dataList.get(position).getJepang());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder{
        private TextView txtIndonesia, txtJepang;

        public MahasiswaViewHolder(View itemView) {
            super(itemView);
            txtIndonesia = (TextView) itemView.findViewById(R.id.indonesia);
            txtJepang = (TextView) itemView.findViewById(R.id.jepang);
        }
    }
}
