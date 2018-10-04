package com.crm.hieunc.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity {
    private DrawerLayout mDrawerLayout;
    Toolbar toolbar;

    GridView gvImg;
    ArrayList<HinhAnh> arrayImg;
    HinhAnhAdapter adapter;
    EditText edtsearch;
    ImageButton imgbtnsearch;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagerhome);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mDrawerLayout = findViewById(R.id.drawer_layout);

        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.home);

        NavigationView navigationView = findViewById(R.id.nav_view);


        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        // set item as selected to persist highlight
//                        menuItem.setChecked(true);
                        // close drawer when item is tapped
//                        mDrawerLayout.closeDrawers();

                        // Add code here to update the UI based on the item selected
                        // For example, swap UI fragments here

                        switch (menuItem.getItemId()) {
                            case R.id.home:
                                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new TrangChu()).commit();
                                break;
                            case R.id.setting:
                                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Setting()).commit();
                                break;
                            case R.id.shopping:
                                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Shopping()).commit();
                                break;
                            case R.id.login:
                                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Login()).commit();
                                break;

                        }
                        mDrawerLayout.closeDrawer(GravityCompat.START);
                        return true;
                    }
                });

        mDrawerLayout.addDrawerListener(
                new DrawerLayout.DrawerListener() {
                    @Override
                    public void onDrawerSlide(View drawerView, float slideOffset) {
                        // Respond when the drawer's position changes
                    }

                    @Override
                    public void onDrawerOpened(View drawerView) {
                        // Respond when the drawer is opened
                    }

                    @Override
                    public void onDrawerClosed(View drawerView) {
                        // Respond when the drawer is closed
                    }

                    @Override
                    public void onDrawerStateChanged(int newState) {
                        // Respond when the drawer motion state changes
                    }
                }
        );

        khoitao();
        adapter = new HinhAnhAdapter(this, R.layout.column_image, arrayImg);
        gvImg.setAdapter(adapter);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


    private void khoitao() {
        gvImg = (GridView) findViewById(R.id.gridViewImg);
        edtsearch = (EditText) findViewById(R.id.searchIndex);
        imgbtnsearch = (ImageButton) findViewById(R.id.searchIndexbtn);

        gvImg = (GridView) findViewById(R.id.gridViewImg);
        arrayImg = new ArrayList<>();
        arrayImg.add(new HinhAnh("dien tu", R.drawable.dientu));
        arrayImg.add(new HinhAnh("me & be", R.drawable.me_be));
        arrayImg.add(new HinhAnh("thu cung", R.drawable.thucung));
        arrayImg.add(new HinhAnh("xe co", R.drawable.anh1));
        arrayImg.add(new HinhAnh("trang suc", R.drawable.anh2));
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

    public void eventSearch() {
        imgbtnsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HomePage.this, edtsearch.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void checkdanhmuc() {
        gvImg.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(HomePage.this, SanPham.class);
                startActivity(intent);
            }
        });
    }

}
