package com.crm.hieunc.app;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Danhgia extends Fragment {

    ArrayList<Danhgias> arraydg;
    DanhgiaAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.danhgia, container, false);

        ListView lvdanggia = (ListView)view.findViewById(R.id.danhgia);
        arraydg = new ArrayList<>();
        arraydg.add(new Danhgias("Nguyen van hieu", "20/10/1998", R.drawable.xeco,"cong viec tot moi truong thoai mai luong cao"));
        arraydg.add(new Danhgias("Nguyen van hieu", "20/10/1998", R.drawable.xeco,"cong viec tot moi truong thoai mai luong cao"));
        arraydg.add(new Danhgias("Nguyen van hieu", "20/10/1998", R.drawable.xeco,"cong viec tot moi truong thoai mai luong cao"));
        arraydg.add(new Danhgias("Nguyen van hieu", "20/10/1998", R.drawable.xeco,"cong viec tot moi truong thoai mai luong cao"));
        arraydg.add(new Danhgias("Nguyen van hieu", "20/10/1998", R.drawable.xeco,"cong viec tot moi truong thoai mai luong cao"));
        arraydg.add(new Danhgias("Nguyen van hieu", "20/10/1998", R.drawable.xeco,"cong viec tot moi truong thoai mai luong cao"));
        arraydg.add(new Danhgias("Nguyen van hieu", "20/10/1998", R.drawable.xeco,"cong viec tot moi truong thoai mai luong cao"));

        adapter = new DanhgiaAdapter(getActivity(), R.layout.dongdanhgia, arraydg);
        lvdanggia.setAdapter(adapter);
        return view;
    }
}
