package com.crm.hieunc.app;

import android.content.Intent;
import android.media.audiofx.DynamicsProcessing;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    public static final String BUNDLE = "bundel";
    Spinner spinner;
    ArrayList<String> listItems = new ArrayList<>();
    ArrayAdapter<String> adapter;
    TextView next;
    public static final String ID = "ID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        overridePendingTransition(R.anim.side_in_right, R.anim.slide_out_left);
        spinner = (Spinner) findViewById(R.id.spinner);
        next = (TextView) findViewById(R.id.next);

        adapter = new ArrayAdapter<String>(this, R.layout.spinner_layout, R.id.txt, listItems);
        spinner.setAdapter(adapter);

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

                        String id = "";
                        switch (text) {
                            case "Miền Bắc":
                                id = " 1 ";
                                Intent intent = new Intent(MainActivity.this, HomePage.class);
                                intent.putExtra(ID, id);
                                startActivity(intent);
                                break;
                            case "Miền Nam":
                                id = " 2 ";
                                Intent intent1 = new Intent(MainActivity.this, HomePage.class);
                                intent1.putExtra(ID, id);
                                startActivity(intent1);
                                break;
                            case "Miền Trung":
                                id = " 3 ";
                                Intent intent2 = new Intent(MainActivity.this, HomePage.class);
                                intent2.putExtra(ID, id);
                                startActivity(intent2);
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

    public void onStart() {
        super.onStart();
        BackTask bt = new BackTask();
        bt.execute();
    }

    private class BackTask extends AsyncTask<Void, Void, Void> {
        ArrayList<String> list;

        protected void onPreExecute() {
            super.onPreExecute();
            list = new ArrayList<>();
        }

        protected Void doInBackground(Void... params) {
            InputStream is = null;
            String result = "";
            try {
                HttpClient httpclient = new DefaultHttpClient();
                HttpPost httppost = new HttpPost("http://192.168.1.143:8888/connectDB_to_android/getVungmien.php");
                HttpResponse response = httpclient.execute(httppost);
                HttpEntity entity = response.getEntity();
                // Get our response as a String.
                is = entity.getContent();
            } catch (IOException e) {
                e.printStackTrace();
            }

            //convert response to string
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(is, "utf-8"));
                String line = null;
                while ((line = reader.readLine()) != null) {
                    result += line;
                }
                is.close();
                //result=sb.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
            // parse json data
            try {
                JSONArray jArray = new JSONArray(result);
                for (int i = 0; i < jArray.length(); i++) {
                    JSONObject jsonObject = jArray.getJSONObject(i);
                    // add interviewee name to arraylist
                    list.add(jsonObject.getString("Ten_vung_mien"));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return null;
        }

        protected void onPostExecute(Void result) {
            listItems.addAll(list);
            adapter.notifyDataSetChanged();
        }
    }

}
