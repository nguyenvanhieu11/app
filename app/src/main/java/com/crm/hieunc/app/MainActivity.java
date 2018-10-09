package com.crm.hieunc.app;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    ProgressBar load;
    int a = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        load = (ProgressBar)findViewById(R.id.pbLoad);
        CountDownTimer Timer = new CountDownTimer(3000, 500) {
            public void onTick(long millisUntilFinished) {

                a += 20;
                load.setProgress(a);

            }

            public void onFinish() {

                Intent intent = new Intent(MainActivity.this,HomePage.class);
                startActivity(intent);
//                Toast.makeText(MainActivity.this, "xong", Toast.LENGTH_SHORT).show();
            }
        }.start();
    }
}
