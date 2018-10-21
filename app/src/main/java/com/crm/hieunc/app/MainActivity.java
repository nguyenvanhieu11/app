package com.crm.hieunc.app;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    ProgressBar load;
//    int a = 10;

    Spinner spinner;
    ArrayList<String> list;

    TextView next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        next = (TextView) findViewById(R.id.next);
        list = new ArrayList<>();
        list.add("Miền Bắc");
        list.add("Miền Nam");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, list);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);

//        load = (ProgressBar)findViewById(R.id.pbLoad);
//        CountDownTimer Timer = new CountDownTimer(3000, 500) {
//            public void onTick(long millisUntilFinished) {
//
//                a += 20;
//                load.setProgress(a);
//
//            }
//
//            public void onFinish() {
//
//                Intent intent = new Intent(MainActivity.this,HomePage.class);
//                startActivity(intent);
////                Toast.makeText(MainActivity.this, "xong", Toast.LENGTH_SHORT).show();
//            }
//        }.start();
        selectItem();
    }

    public void selectItem() {
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(final AdapterView<?> adapterView, View view, final int i, long l) {

                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String text = adapterView.getItemAtPosition(i).toString();
                        switch (text){
                            case "Miền Bắc":
                                Intent intent = new Intent(MainActivity.this,HomePage.class);
                                startActivity(intent);
//                                Toast.makeText(MainActivity.this,text,Toast.LENGTH_SHORT).show();
                                break;
                            case "Miền Nam":
                                Intent intent1 = new Intent(MainActivity.this,HomePage.class);
                                startActivity(intent1);
//                                Toast.makeText(MainActivity.this,text,Toast.LENGTH_SHORT).show();
                                break;
                        }
                    }
                });

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(MainActivity.this,"no thing Selected",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
