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
//    GridView gvImg;
//    ArrayList<HinhAnh> arrayImg;
//    HinhAnhAdapter adapter;

    CardView cardView1, cardView2, cardView3, cardView4, cardView5;

    public static TrangChu newTrangChu() {

        TrangChu trangChu = new TrangChu();

        return trangChu;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.trangchu, container, false);

//        gvImg = (GridView) view.findViewById(R.id.gridViewImg);
//        arrayImg = new ArrayList<>();
//        arrayImg.add(new HinhAnh("dien tu", R.drawable.dientu));
//        arrayImg.add(new HinhAnh("me & be", R.drawable.me_be));
//        arrayImg.add(new HinhAnh("thu cung", R.drawable.thucung));
//        arrayImg.add(new HinhAnh("xe co", R.drawable.anh1));
//        arrayImg.add(new HinhAnh("trang suc", R.drawable.anh2));
//        arrayImg.add(new HinhAnh("xe co", R.drawable.anh3));
//        arrayImg.add(new HinhAnh("xe co", R.drawable.anh4));
//        arrayImg.add(new HinhAnh("xe co", R.drawable.anh5));
//        arrayImg.add(new HinhAnh("gia dung", R.drawable.giadung));
//        arrayImg.add(new HinhAnh("xe co", R.drawable.anh6));
//        arrayImg.add(new HinhAnh("xe co", R.drawable.nh7));
//        arrayImg.add(new HinhAnh("xe co", R.drawable.xeco));
//        arrayImg.add(new HinhAnh("gia dung", R.drawable.giadung));
//        arrayImg.add(new HinhAnh("xe co", R.drawable.anh6));
//        arrayImg.add(new HinhAnh("xe co", R.drawable.nh7));
//        arrayImg.add(new HinhAnh("xe co", R.drawable.xeco));
//
//        adapter = new HinhAnhAdapter(getActivity(), R.layout.column_image, arrayImg);
//        gvImg.setAdapter(adapter);
//
//        gvImg.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Intent intent = new Intent(getActivity(), SanPham.class);
//                startActivity(intent);
//            }
//        });

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
