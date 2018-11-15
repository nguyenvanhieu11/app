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

public class Detail1 extends Fragment {

    ArrayList<Details> arraydt;
    DetailAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.detail1, container, false);


        ListView lvdetail = (ListView) view.findViewById(R.id.chitiet);
        arraydt = new ArrayList<>();
        arraydt.add(new Details("Dia chi", "Moc Hoan Van Con Hoai Duc Ha Noi", R.drawable.ic_hamberger));
        arraydt.add(new Details("Ten cong viec", "lap trinh vien php", R.drawable.ic_hamberger));
        arraydt.add(new Details("Yeu cau cong viec", "Co tu duy " +
                "thanh thao php, mysql, html, css", R.drawable.ic_hamberger));
        arraydt.add(new Details("Muc luong", "$800 - $1000", R.drawable.ic_hamberger));
        arraydt.add(new Details("Email", "Vanhieu1998@gmail.com", R.drawable.ic_hamberger));
        arraydt.add(new Details("So dien thoai", "0355420606", R.drawable.ic_hamberger));

        adapter = new DetailAdapter(getActivity(), R.layout.detaicolum, arraydt);
        lvdetail.setAdapter(adapter);
        return view;
    }
}
