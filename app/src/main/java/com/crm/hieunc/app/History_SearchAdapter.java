package com.crm.hieunc.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class History_SearchAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<History_Search1> historySearch1ArrayList;
    private int layout;

    public History_SearchAdapter(Context context, ArrayList<History_Search1> historySearch1ArrayList, int layout) {
        this.context = context;
        this.historySearch1ArrayList = historySearch1ArrayList;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return historySearch1ArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        TextView txtSearch;
        TextView txtTime;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder;
        if(view == null){
            holder = new ViewHolder();
            LayoutInflater inflater  = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);

            holder.txtSearch = (TextView)view.findViewById(R.id.textsearch);
            holder.txtTime = (TextView) view.findViewById(R.id.txttime);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }


        History_Search1 history_search1 = historySearch1ArrayList.get(i);
        holder.txtSearch.setText(history_search1.getSearch());
        holder.txtTime.setText(history_search1.getTime());

        return null;
    }
}
