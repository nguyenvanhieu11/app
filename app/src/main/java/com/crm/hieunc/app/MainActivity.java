package com.crm.hieunc.app;

import android.content.Intent;
import android.net.http.RequestQueue;
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

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    ArrayList<String> list;

    TextView next;

    String url = "http://192.168.71.2/connectDB_to_android/getData.php";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        next = (TextView) findViewById(R.id.next);
        list = new ArrayList<>();
        list.add("Miền Bắc");
        list.add("Miền Nam");

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, list);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);
        selectItem();
        getData(url);
    }

    public void selectItem() {
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(final AdapterView<?> adapterView, View view, final int i, long l) {

                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String text = adapterView.getItemAtPosition(i).toString();
                        switch (text) {
                            case "Miền Bắc":
                                Intent intent = new Intent(MainActivity.this, HomePage.class);
                                startActivity(intent);
//                                Toast.makeText(MainActivity.this,text,Toast.LENGTH_SHORT).show();
                                break;
                            case "Miền Nam":
                                Intent intent1 = new Intent(MainActivity.this, HomePage.class);
                                startActivity(intent1);
//                                Toast.makeText(MainActivity.this,text,Toast.LENGTH_SHORT).show();
                                break;
                        }
                    }
                });

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(MainActivity.this, "no thing Selected", Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void getData(String url) {
        com.android.volley.RequestQueue requestQueue = Volley.newRequestQueue(this);
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        Toast.makeText(MainActivity.this,response.toString(),Toast.LENGTH_LONG).show();
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(MainActivity.this,"Lỗi",Toast.LENGTH_LONG).show();
                    }
                }
        );
        requestQueue.add(jsonArrayRequest);
    }
}
