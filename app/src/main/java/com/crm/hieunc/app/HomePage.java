package com.crm.hieunc.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomePage extends AppCompatActivity {
    public static final String BUNDLE = "bundel";
    private DrawerLayout mDrawerLayout;
    Toolbar toolbar;
    public static final String IDvungmien = "IDvungmien";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagerhome);

        overridePendingTransition(R.anim.side_in_right, R.anim.slide_out_left);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mDrawerLayout = findViewById(R.id.drawer_layout);

        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_hamberger);

        NavigationView navigationView = findViewById(R.id.nav_view);

        String id = "";
        Intent intent = getIntent();
        if (intent != null) {
            Bundle bundle = intent.getBundleExtra(MainActivity.BUNDLE);
            if (bundle != null) {
                id = (bundle.getString(MainActivity.ID));
            } else {
                id = (intent.getStringExtra(MainActivity.ID));
            }
        }

        final String Idvungmien = id;
        Toast.makeText(getApplication(), Idvungmien , Toast.LENGTH_LONG).show();

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new TrangChu()).commit();
            navigationView.setCheckedItem(R.id.home);
        }

        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        menuItem.setChecked(true);
                        mDrawerLayout.closeDrawers();

                        switch (menuItem.getItemId()) {
                            case R.id.home:
                                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new TrangChu()).commit();
                                break;
                            case R.id.setting:
                                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Setting()).commit();
                                break;
                            case R.id.login:
                                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Login()).commit();
                                break;
                            case R.id.historynote:
                                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new History_Note()).commit();
                                break;
                            case R.id.historysearch:
                                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new History()).commit();
                                break;
                            case R.id.helper:
                                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new Helper()).commit();
                                break;
                            default:
                                getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new TrangChu()).commit();
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

}
