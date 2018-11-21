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
import android.widget.Toast;

public class TrangChu extends Fragment {


    private static final String DEBUG_TAG = "";

    CardView cardView1, cardView2, cardView3, cardView4, cardView5;

    public static TrangChu newTrangChu() {

        TrangChu trangChu = new TrangChu();

        return trangChu;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.trangchu, container, false);

        cardView1 = (CardView) view.findViewById(R.id.cardviewone);
        cardView2 = (CardView) view.findViewById(R.id.cardviewtow);
        cardView3 = (CardView) view.findViewById(R.id.cardviewthree);
        cardView4 = (CardView) view.findViewById(R.id.cardviewfour);
        cardView5 = (CardView) view.findViewById(R.id.cardviewfine);


        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(getActivity(),"hello this is cardview one",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), SanPham.class);
                startActivity(intent);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "hello this is cardview two", Toast.LENGTH_SHORT).show();
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "hello this is cardview three", Toast.LENGTH_SHORT).show();
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "hello this is cardview four", Toast.LENGTH_SHORT).show();
            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "hello this is cardview fine", Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }


}
