package com.crm.hieunc.app;

import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ProgressBar load;
    private int progressCount;
    Button btn;
    int a = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        load = (ProgressBar)findViewById(R.id.pbLoad);
        CountDownTimer Timer = new CountDownTimer(3000, 500) {
            public void onTick(long millisUntilFinished) {

                a += 20;
                load.setProgress(a);

            }

            public void onFinish() {

                Intent intent = new Intent(MainActivity.this,Index.class);
                startActivity(intent);
//                Toast.makeText(MainActivity.this, "xong", Toast.LENGTH_SHORT).show();
            }
        }.start();
    }
}
