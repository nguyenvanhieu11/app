package com.crm.hieunc.app;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class DanhgiaAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Danhgias> DanhgiaList;

    public DanhgiaAdapter(Context context, int layout, List<Danhgias> danhgiaList) {
        this.context = context;
        this.layout = layout;
        this.DanhgiaList = danhgiaList;
    }

    @Override
    public int getCount() {
        return DanhgiaList.size();
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
        ImageView avater;
        TextView txtten, txtdate, txtnoidung;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        DanhgiaAdapter.ViewHolder holder;
        if (view == null) {
            holder = new DanhgiaAdapter.ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);

            holder.txtten = (TextView) view.findViewById(R.id.ten);
            holder.txtdate = (TextView) view.findViewById(R.id.time);
            holder.txtnoidung = (TextView) view.findViewById(R.id.noidung);
            holder.avater = (ImageView) view.findViewById(R.id.avatar);
            view.setTag(holder);
        } else {
            holder = (DanhgiaAdapter.ViewHolder) view.getTag();
        }


        Danhgias danhgias = DanhgiaList.get(i);
        holder.avater.setImageResource(danhgias.getHinhanh());
        holder.txtten.setText(danhgias.getTenthanhvien());
        holder.txtdate.setText(danhgias.getThoigian());
        holder.txtnoidung.setText(danhgias.getNoidung());
        return view;
    }
}
