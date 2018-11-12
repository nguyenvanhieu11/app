package com.crm.hieunc.app;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

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
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        dangbai();
        Dialog myDialog = new Dialog(this);
    }

    private void khoitao() {
        lvHome = (ListView) findViewById(R.id.listItem);
        arrayList = new ArrayList<>();
        arrayList.add(new Home1("laptop macbooks 2018", "Ha Noi", "32.000.000", "còn hàng", R.drawable.xeco));
        arrayList.add(new Home1("laptop macbooks 2011", "Ha Noi", "32.000.000", "còn hàng", R.drawable.xeco));
        arrayList.add(new Home1("laptop macbooks 2013", "Ha Noi", "32.000.000", "còn hàng", R.drawable.xeco));
        arrayList.add(new Home1("laptop macbooks 2012", "Ha Noi", "32.000.000", "còn hàng", R.drawable.xeco));
        arrayList.add(new Home1("laptop macbooks 2015", "Ha Noi", "32.000.000", "còn hàng", R.drawable.xeco));
        arrayList.add(new Home1("laptop macbooks 2016", "Ha Noi", "32.000.000", "còn hàng", R.drawable.xeco));
        arrayList.add(new Home1("laptop macbooks 2007", "Ha Noi", "32.000.000", "còn hàng", R.drawable.xeco));
        arrayList.add(new Home1("laptop macbooks 2008", "Ha Noi", "32.000.000", "còn hàng", R.drawable.xeco));
        arrayList.add(new Home1("laptop macbooks 2010", "Ha Noi", "32.000.000", "còn hàng", R.drawable.xeco));
        arrayList.add(new Home1("laptop macbooks 2010", "Ha Noi", "32.000.000", "còn hàng", R.drawable.xeco));
        arrayList.add(new Home1("laptop macbooks 2010", "Ha Noi", "32.000.000", "còn hàng", R.drawable.xeco));
        arrayList.add(new Home1("laptop macbooks 2010", "Ha Noi", "32.000.000", "còn hàng", R.drawable.xeco));
        arrayList.add(new Home1("laptop macbooks 2010", "Ha Noi", "32.000.000", "còn hàng", R.drawable.xeco));
        arrayList.add(new Home1("laptop macbooks 2010", "Ha Noi", "32.000.000", "còn hàng", R.drawable.xeco));
        arrayList.add(new Home1("laptop macbooks 2010", "Ha Noi", "32.000.000", "còn hàng", R.drawable.xeco));

        lvHome.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(SanPham.this,"hihih",Toast.LENGTH_SHORT).show();
                showDialog();
            }
        });
//        lvHome.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//            @Override
//            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
//                return false;
//            }
//        });
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

    public void showDialog() {
        final Dialog myDialog = new Dialog(this);
        myDialog.setContentView(R.layout.dialogshow);
        myDialog.setCanceledOnTouchOutside(false);
        TextView txtClose;
        txtClose = (TextView) myDialog.findViewById(R.id.close);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();

        txtClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });

        LinearLayout luu,xemct,xemvt;

        luu = (LinearLayout)myDialog.findViewById(R.id.luubaiviet);
        xemct = (LinearLayout)myDialog.findViewById(R.id.xemchitiet);
        xemvt = (LinearLayout)myDialog.findViewById(R.id.xemvitri);
        xemct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
                Intent intent1 = new Intent(SanPham.this,Detail.class);
                startActivity(intent1);

            }
        });

        xemvt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
                Intent intent = new Intent(SanPham.this,SearchMap.class);
                startActivity(intent);
            }
        });

        luu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
                Toast.makeText(SanPham.this, "Lưu bài viết thành công ", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
