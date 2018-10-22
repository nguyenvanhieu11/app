package com.crm.hieunc.app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Dang_bai extends AppCompatActivity {

    Toolbar toolbar;
    Spinner tuyendung;
    TextView next;
    ArrayList<String> list;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dang_bai);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_aback);
        tuyendung();
    }

    public void tuyendung() {
//        tuyendung = (Spinner) findViewById(R.id.tuyendung);
//        list = new ArrayList<>();
//        list.add("Tuyển dụng doanh nghiệp");
//        list.add("Tuyển dụng tư nhân");
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Dang_bai.this, android.R.layout.simple_expandable_list_item_1, list);
//        tuyendung.setAdapter(adapter);
    }
}
