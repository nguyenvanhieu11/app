package com.crm.hieunc.app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class HomeAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Home1> home1List;

    public HomeAdapter(Context context, int layout, List<Home1> home1List) {
        this.context = context;
        this.layout = layout;
        this.home1List = home1List;
    }

    @Override
    public int getCount() {
        return home1List.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);

        TextView ten = (TextView) view.findViewById(R.id.nameProduct);
        TextView address = (TextView) view.findViewById(R.id.Address);
        TextView gia = (TextView) view.findViewById(R.id.giaban);
        TextView tinhtrang = (TextView) view.findViewById(R.id.tinhtrang);

        Home1 home1 = home1List.get(i);

        ten.setText(home1.getTen());
        address.setText(home1.getDiaChi());
        gia.setText(home1.getGia());
        tinhtrang.setText(home1.getTinhTrang());

        return view;
    }

}
