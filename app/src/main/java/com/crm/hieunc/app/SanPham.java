package com.crm.hieunc.app;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TabHost;

import java.util.ArrayList;

public class SanPham  extends Index{

    TabHost tabhost;
    ImageButton butonBack;

    ListView lvHome;
    ArrayList<Home1> arrayList;
    HomeAdapter adapter;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_sanpham);



        anhXa();
        eventSearch();
        backActivity();
        khoitao();
        adapter = new HomeAdapter(this,R.layout.home,arrayList);
        lvHome.setAdapter(adapter);

    }

    private void anhXa() {
        tabhost = (TabHost)findViewById(R.id.tabHost);
        tabhost.setup();

        TabHost.TabSpec tab1 = tabhost.newTabSpec("Tab01");
        tab1.setIndicator("",getResources().getDrawable(R.drawable.home));
        tab1.setContent(R.id.tab1);
        tabhost.addTab(tab1);

        TabHost.TabSpec tab2 = tabhost.newTabSpec("Tab02");
        tab2.setIndicator("",getResources().getDrawable(R.drawable.address));
        tab2.setContent(R.id.tab2);
        tabhost.addTab(tab2);

        TabHost.TabSpec tab3 = tabhost.newTabSpec("Tab03");
        tab3.setIndicator("",getResources().getDrawable(R.drawable.setting));
        tab3.setContent(R.id.tab3);
        tabhost.addTab(tab3);

        TabHost.TabSpec tab4 = tabhost.newTabSpec("Tab04");
        tab4.setIndicator("",getResources().getDrawable(R.drawable.search));
        tab4.setContent(R.id.tab4);
        tabhost.addTab(tab4);
    }

    private void backActivity(){
        butonBack = (ImageButton)findViewById(R.id.backActivity);
        butonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SanPham.this,Index.class);
                startActivity(intent);
            }
        });
    }

    private void khoitao() {
        lvHome = (ListView)findViewById(R.id.listItem);
        arrayList = new ArrayList<>();
        arrayList.add(new Home1("laptop macbooks 2018","Ha Noi",R.drawable.anh1,"32.000.000","còn hàng"));
        arrayList.add(new Home1("laptop macbooks 2011","Ha Noi",R.drawable.anh2,"32.000.000","còn hàng"));
        arrayList.add(new Home1("laptop macbooks 2013","Ha Noi",R.drawable.anh3,"32.000.000","còn hàng"));
        arrayList.add(new Home1("laptop macbooks 2012","Ha Noi",R.drawable.anh4,"32.000.000","còn hàng"));
        arrayList.add(new Home1("laptop macbooks 2015","Ha Noi",R.drawable.anh5,"32.000.000","còn hàng"));
        arrayList.add(new Home1("laptop macbooks 2016","Ha Noi",R.drawable.anh6,"32.000.000","còn hàng"));
        arrayList.add(new Home1("laptop macbooks 2007","Ha Noi",R.drawable.thucung,"32.000.000","còn hàng"));
        arrayList.add(new Home1("laptop macbooks 2008","Ha Noi",R.drawable.giadung,"32.000.000","còn hàng"));
        arrayList.add(new Home1("laptop macbooks 2010","Ha Noi",R.drawable.me_be,"32.000.000","còn hàng"));
    }
}
