package com.crm.hieunc.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class NghangngheAdapter extends BaseAdapter {
    private PassData passData;

    public static final String BUNDLE = "bundel";
    public static final String IDvungmien = "IDvungmien";
    private Context context;
    private int layout;
    private List<Nghanh_nghe> nghanh_ngheList;
    private String Id_vung_mien;

//    String url = "http://192.168.1.201:8888/connectDB_to_android/getAllnghanhnghe.php";
    public NghangngheAdapter(Context context, int layout, ArrayList<Nghanh_nghe> nghanh_ngheList, PassData passData) {
        this.context = context;
        this.layout = layout;
        this.nghanh_ngheList = nghanh_ngheList;
        this.passData = passData;
    }

    @Override
    public int getCount() {
        return nghanh_ngheList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder {
        TextView ten_nghanhnghe, mota;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        NghangngheAdapter.ViewHolder holder;
        if (view == null) {
            holder = new NghangngheAdapter.ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);

            holder.ten_nghanhnghe = (TextView) view.findViewById(R.id.tennghanhnghe);
            holder.mota = (TextView) view.findViewById(R.id.mota);
            view.setTag(holder);
        } else {
            holder = (NghangngheAdapter.ViewHolder) view.getTag();
        }

        String id = "";
        Intent intent = ((Activity) context).getIntent();
        if (intent != null) {
            Bundle bundle = intent.getBundleExtra(HomePage.BUNDLE);
            if (bundle != null) {
                id = (bundle.getString(HomePage.IDvungmien));
            } else {
                id = (intent.getStringExtra(HomePage.IDvungmien));
            }
        }
        final String finalId = id;
        final Nghanh_nghe nghanh_nghe = nghanh_ngheList.get(i);
        holder.ten_nghanhnghe.setText(nghanh_nghe.getTen_nghanh_nghe());
        holder.mota.setText(nghanh_nghe.getMota());
        final int id_nghanh_nghe = nghanh_nghe.getId_nghanh_nghe();


        holder.ten_nghanhnghe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                passData.passData(id_nghanh_nghe);
                Intent intent = new Intent(context, SanPham.class);
                context.startActivity(intent);
            }
        });

//        holder.mota.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(context, SanPham.class);
//                context.startActivity(intent);
//
//            }
//        });
        return view;
    }
}
