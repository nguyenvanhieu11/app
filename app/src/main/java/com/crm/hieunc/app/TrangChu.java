package com.crm.hieunc.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TrangChu extends Fragment {

    private static final String DEBUG_TAG = "";

    GridView gvNghanhnghe;
    ArrayList<Nghanh_nghe> arrayList;
    NghangngheAdapter adapter;
    CardView cardView1, cardView2, cardView3, cardView4, cardView5;
    String url = "http://192.168.1.143:8888/connectDB_to_android/getAllnghanhnghe.php";

    public static TrangChu newTrangChu() {

        TrangChu trangChu = new TrangChu();

        return trangChu;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_nghanh_nghe, container, false);

        cardView1 = (CardView) view.findViewById(R.id.cardviewone);
        cardView2 = (CardView) view.findViewById(R.id.cardviewtow);
        cardView3 = (CardView) view.findViewById(R.id.cardviewthree);
        cardView4 = (CardView) view.findViewById(R.id.cardviewfour);
        cardView5 = (CardView) view.findViewById(R.id.cardviewfine);


        gvNghanhnghe = (GridView) view.findViewById(R.id.nghanhnghe);
        arrayList = new ArrayList<>();
        RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        for (int i = 0; i < response.length(); i++) {
                            try {
                                JSONObject jsonObject = response.getJSONObject(i);
                                arrayList.add(new Nghanh_nghe(
                                        jsonObject.getString("Ten_nghanh_nghe"),
                                        jsonObject.getString("Mo_ta_nghanh_nghe")
                                ));
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getActivity(), error.toString(), Toast.LENGTH_LONG).show();
                    }
                }
        );
        requestQueue.add(jsonArrayRequest);
        adapter = new NghangngheAdapter(getActivity(), R.layout.dong_nghanh_nghe, arrayList);
        gvNghanhnghe.setAdapter(adapter);

        return view;
    }
}
