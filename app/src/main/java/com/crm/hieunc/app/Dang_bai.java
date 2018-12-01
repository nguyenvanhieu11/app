package com.crm.hieunc.app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Dang_bai extends AppCompatActivity {

    Toolbar toolbar;
    Spinner vitri, chucvu;
    RadioGroup vungmien;

    ArrayList<String> vi_tri, chuc_vu;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dang_bai);
        overridePendingTransition(R.anim.side_in_right, R.anim.slide_out_left);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_aback);
        dang_bai();
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        event();
    }

    public void dang_bai() {
        vitri = (Spinner) findViewById(R.id.vitri);
        chucvu = (Spinner) findViewById(R.id.capbac);
        vi_tri = new ArrayList<>();
        vi_tri.add("Hà Nội");
        vi_tri.add("Hải Phòng");
        vi_tri.add("Nam Định");
        vi_tri.add("Bắc Giang");
        vi_tri.add("Vĩnh Phúc");
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_gallery_item, vi_tri);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        vitri.setAdapter(adapter);

        chuc_vu = new ArrayList<>();
        chuc_vu.add("quản lý");
        chuc_vu.add("lập trình viên");
        chuc_vu.add("nhân viên hành chính");
        chuc_vu.add("khác");

        ArrayAdapter adapter1 = new ArrayAdapter(this, android.R.layout.simple_gallery_item, chuc_vu);
        adapter1.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        chucvu.setAdapter(adapter1);
    }

    private void event() {
        vungmien = (RadioGroup) findViewById(R.id.vungmien);
        vungmien.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int check = radioGroup.getCheckedRadioButtonId();

                if (check == R.id.mienbac) {
                    Toast.makeText(Dang_bai.this, "ban chon mien bac", Toast.LENGTH_LONG).show();
                } else if (check == R.id.miennam) {
                    Toast.makeText(Dang_bai.this, "ban chon mien nam", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
