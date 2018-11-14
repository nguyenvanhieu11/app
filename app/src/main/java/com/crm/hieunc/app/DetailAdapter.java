package com.crm.hieunc.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DetailAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Details> DetaitList;

    public DetailAdapter(Context context, int layout, List<Details> detaitList) {
        this.context = context;
        this.layout = layout;
        this.DetaitList = detaitList;
    }

    @Override
    public int getCount() {
        return DetaitList.size();
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
        ImageView icon;
        TextView txtmota, txttenmota;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        DetailAdapter.ViewHolder holder;
        if (view == null) {
            holder = new DetailAdapter.ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);

            holder.txtmota = (TextView) view.findViewById(R.id.mota);
            holder.txttenmota = (TextView) view.findViewById(R.id.tenmota);
            holder.icon = (ImageView) view.findViewById(R.id.icon);
            view.setTag(holder);
        } else {
            holder = (DetailAdapter.ViewHolder) view.getTag();
        }


        Details details = DetaitList.get(i);
        holder.icon.setImageResource(details.getIcon());
        holder.txtmota.setText(details.getMota());
        holder.txttenmota.setText(details.getTenmota());

        return view;
    }
}
