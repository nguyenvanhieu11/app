package com.crm.hieunc.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class Index extends AppCompatActivity{

    GridView gvImg;
    ArrayList<HinhAnh> arrayImg;
    HinhAnhAdapter adapter;
    EditText edtsearch;
    ImageButton imgbtnsearch;

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
        edtsearch = (EditText)findViewById(R.id.searchIndex);
        imgbtnsearch = (ImageButton) findViewById(R.id.searchIndexbtn);

        gvImg = (GridView)findViewById(R.id.gridViewImg);
        arrayImg = new ArrayList<>();
        arrayImg.add(new HinhAnh("dien tu", R.drawable.dientu));
        arrayImg.add(new HinhAnh("me & be", R.drawable.me_be));
        arrayImg.add(new HinhAnh("thu cung", R.drawable.thucung));
        arrayImg.add(new HinhAnh("xe co", R.drawable.anh1));
        arrayImg.add(new HinhAnh("xe co", R.drawable.anh2));
        arrayImg.add(new HinhAnh("xe co", R.drawable.anh3));
        arrayImg.add(new HinhAnh("xe co", R.drawable.anh4));
        arrayImg.add(new HinhAnh("xe co", R.drawable.anh5));
        arrayImg.add(new HinhAnh("gia dung", R.drawable.giadung));
        arrayImg.add(new HinhAnh("xe co", R.drawable.anh6));
        arrayImg.add(new HinhAnh("xe co", R.drawable.nh7));
        arrayImg.add(new HinhAnh("xe co", R.drawable.xeco));
        eventSearch();
        checkdanhmuc();
    }

    public void eventSearch(){
        imgbtnsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Index.this,edtsearch.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void checkdanhmuc(){
        gvImg.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Index.this,SanPham.class);
                startActivity(intent);
            }
        });
    }


}
