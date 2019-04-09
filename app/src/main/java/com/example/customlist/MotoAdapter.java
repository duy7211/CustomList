package com.example.customlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MotoAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<clsMoto> motoList;

    public MotoAdapter(Context context, int layout, List<clsMoto> motoList) {
        this.context = context;
        this.layout = layout;
        this.motoList = motoList;
    }

    @Override
    public int getCount() {
        return motoList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);

        TextView tvName = convertView.findViewById(R.id.tvTen);
        TextView tvDetail = convertView.findViewById(R.id.tvChitiet);
        ImageView imgHinh = convertView.findViewById(R.id.imgHinh);

        clsMoto moto = motoList.get(position);
        tvName.setText(moto.getName());
        tvDetail.setText(moto.getDetail());
        imgHinh.setImageResource(moto.getImgHinh());
        return convertView;
    }
}
