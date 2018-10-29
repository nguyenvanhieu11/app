package com.crm.hieunc.app;

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

public class HomePage extends AppCompatActivity {
    private DrawerLayout mDrawerLayout;
    Toolbar toolbar;

    Button btndangtin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagerhome);

        btndangtin = (Button) findViewById(R.id.btndangbai);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mDrawerLayout = findViewById(R.id.drawer_layout);

        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_hamberger);

        NavigationView navigationView = findViewById(R.id.nav_view);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, new TrangChu()).commit();
            navigationView.setCheckedItem(R.id.home);
        }


        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        // set item as selected to persist highlight
                        menuItem.setChecked(true);
                        // close drawer when item is tapped
                        mDrawerLayout.closeDrawers();

                        // Add code here to update the UI based on the item selected
                        // For example, swap UI fragments here

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_prop, menu);
        MenuItem searchItem = menu.findItem(R.id.search);

        return true;
    }

}
