package com.crm.hieunc.app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import java.util.ArrayList;

public class Index extends AppCompatActivity{

    GridView gvImg;
    ArrayList<HinhAnh> arrayImg;
    HinhAnhAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);

        khoitao();
        adapter = new HinhAnhAdapter(this,R.layout.column_image,arrayImg);
        gvImg.setAdapter(adapter);

    }

    private void khoitao() {
        gvImg = (GridView)findViewById(R.id.gridViewImg);
        arrayImg = new ArrayList<>();
        arrayImg.add(new HinhAnh("dien tu", R.drawable.dientu));
        arrayImg.add(new HinhAnh("gia dung", R.drawable.giadung));
        arrayImg.add(new HinhAnh("me & be", R.drawable.me_be));
        arrayImg.add(new HinhAnh("thu cung", R.drawable.thucung));
        arrayImg.add(new HinhAnh("xe co", R.drawable.xeco));
    }


}
