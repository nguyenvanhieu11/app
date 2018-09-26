package com.crm.hieunc.app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;

public class SanPham  extends AppCompatActivity{

    TabHost tabhost;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_sanpham);

        khoitao();
    }

    private void khoitao() {
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
        tab4.setIndicator("",getResources().getDrawable(R.drawable.setting));
        tab4.setContent(R.id.tab4);
        tabhost.addTab(tab4);

    }

}
