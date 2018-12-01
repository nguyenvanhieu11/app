package com.crm.hieunc.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class NghangngheAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Nghanh_nghe> nghanh_ngheList;

    public NghangngheAdapter(Context context, int layout, ArrayList<Nghanh_nghe> nghanh_ngheList) {
        this.context = context;
        this.layout = layout;
        this.nghanh_ngheList = nghanh_ngheList;
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


        Nghanh_nghe nghanh_nghe = nghanh_ngheList.get(i);
        holder.ten_nghanhnghe.setText(nghanh_nghe.getTen_nghanh_nghe());
        holder.mota.setText(nghanh_nghe.getMota());

        return view;
    }
}
