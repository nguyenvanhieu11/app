package com.crm.hieunc.app;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ProgressBar load;
    private int progressCount;
    private Handler progressbarHandler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        load = (ProgressBar)findViewById(R.id.pbLoad);
        int pgb = load.getProgress();
        pgb+=5;
        load.setProgress(pgb);
        if(load.getProgress() < load.getMax()){
            pgb+=5;
            load.setProgress(pgb);
        }else if(load.getProgress()== load.getMax()){
            Toast.makeText(MainActivity.this,"hoan thanh",Toast.LENGTH_SHORT).show();
        }
    }
}
