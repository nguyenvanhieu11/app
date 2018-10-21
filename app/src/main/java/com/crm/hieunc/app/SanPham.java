package com.crm.hieunc.app;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class SanPham extends AppCompatActivity {


    ListView lvHome;
    ArrayList<Home1> arrayList;
    ArrayList<String> listaddres, listtime, listluong;
    HomeAdapter adapter;

    Toolbar toolbar;
    private Spinner address, time, luong;
    private Button dangbai;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_sanpham);

        khoitao();
        adapter = new HomeAdapter(this, R.layout.home, arrayList);
        lvHome.setAdapter(adapter);

        search();
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_aback);

        dangbai();
    }

    private void khoitao() {
        lvHome = (ListView) findViewById(R.id.listItem);
        arrayList = new ArrayList<>();
        arrayList.add(new Home1("laptop macbooks 2018", "Ha Noi", R.drawable.xeco, "32.000.000", "còn hàng"));
        arrayList.add(new Home1("laptop macbooks 2011", "Ha Noi", R.drawable.xeco, "32.000.000", "còn hàng"));
        arrayList.add(new Home1("laptop macbooks 2013", "Ha Noi", R.drawable.xeco, "32.000.000", "còn hàng"));
        arrayList.add(new Home1("laptop macbooks 2012", "Ha Noi", R.drawable.xeco, "32.000.000", "còn hàng"));
        arrayList.add(new Home1("laptop macbooks 2015", "Ha Noi", R.drawable.xeco, "32.000.000", "còn hàng"));
        arrayList.add(new Home1("laptop macbooks 2016", "Ha Noi", R.drawable.xeco, "32.000.000", "còn hàng"));
        arrayList.add(new Home1("laptop macbooks 2007", "Ha Noi", R.drawable.thucung, "32.000.000", "còn hàng"));
        arrayList.add(new Home1("laptop macbooks 2008", "Ha Noi", R.drawable.xeco, "32.000.000", "còn hàng"));
        arrayList.add(new Home1("laptop macbooks 2010", "Ha Noi", R.drawable.xeco, "32.000.000", "còn hàng"));
        arrayList.add(new Home1("laptop macbooks 2010", "Ha Noi", R.drawable.xeco, "32.000.000", "còn hàng"));
        arrayList.add(new Home1("laptop macbooks 2010", "Ha Noi", R.drawable.xeco, "32.000.000", "còn hàng"));
        arrayList.add(new Home1("laptop macbooks 2010", "Ha Noi", R.drawable.xeco, "32.000.000", "còn hàng"));
        arrayList.add(new Home1("laptop macbooks 2010", "Ha Noi", R.drawable.xeco, "32.000.000", "còn hàng"));
        arrayList.add(new Home1("laptop macbooks 2010", "Ha Noi", R.drawable.xeco, "32.000.000", "còn hàng"));
        arrayList.add(new Home1("laptop macbooks 2010", "Ha Noi", R.drawable.xeco, "32.000.000", "còn hàng"));

        lvHome.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(SanPham.this, "hhihi", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item, menu);
        MenuItem searchItem = menu.findItem(R.id.search);
        return true;
    }

    public void search() {

        address = (Spinner) findViewById(R.id.address);
        time = (Spinner) findViewById(R.id.time);
        luong = (Spinner) findViewById(R.id.luong);

        listaddres = new ArrayList<String>();
        listaddres.add("Hà Nội");
        listaddres.add("Huế");
        listaddres.add("Nha Trang");
        listaddres.add("Cần Sa");
        listaddres.add("Vũng  tàu");
        listaddres.add("Mộc Hoán");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(SanPham.this, android.R.layout.simple_expandable_list_item_1, listaddres);
        address.setAdapter(arrayAdapter);
        time.setAdapter(arrayAdapter);
        luong.setAdapter(arrayAdapter);
    }

    public void dangbai() {
        dangbai = (Button) findViewById(R.id.dangbai);
        dangbai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dang = new Intent(SanPham.this, Dang_bai.class);
                startActivity(dang);
            }
        });
    }
}
