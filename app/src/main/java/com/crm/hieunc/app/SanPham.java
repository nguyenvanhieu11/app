package com.crm.hieunc.app;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SanPham extends AppCompatActivity {

    ListView lvHome;
    ArrayList<Home1> arrayList;
    HomeAdapter adapter;

    private BottomNavigationView nav_bottom;


    Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_sanpham);
        overridePendingTransition(R.anim.side_in_right, R.anim.slide_out_left);
        khoitao();
        adapter = new HomeAdapter(this, R.layout.home, arrayList);
        lvHome.setAdapter(adapter);

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
        eventnav();
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

    private void eventnav() {
        nav_bottom = (BottomNavigationView) findViewById(R.id.nav_bottom);
        nav_bottom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.add:
                        Intent intenadd = new Intent(SanPham.this, Dang_bai.class);
                        startActivity(intenadd);
                        break;
                    case R.id.search:
                        Intent intensearch = new Intent(SanPham.this, TimKiem .class);
                        startActivity(intensearch);
                        break;
                    case R.id.home:
                        Intent intenhome = new Intent(SanPham.this, SecoundFragment.class);
                        startActivity(intenhome);
                        break;
                }
                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item, menu);
        MenuItem searchItem = menu.findItem(R.id.search);
        return true;
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

        LinearLayout luu, xemct, xemvt;

        luu = (LinearLayout) myDialog.findViewById(R.id.luubaiviet);
        xemct = (LinearLayout) myDialog.findViewById(R.id.xemchitiet);
        xemvt = (LinearLayout) myDialog.findViewById(R.id.xemvitri);
        xemct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
                Intent intent1 = new Intent(SanPham.this, Detail.class);
                startActivity(intent1);

            }
        });

        xemvt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
                Intent intent = new Intent(SanPham.this, SearchMap.class);
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
