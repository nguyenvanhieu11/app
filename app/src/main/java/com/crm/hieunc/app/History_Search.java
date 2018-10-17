package com.crm.hieunc.app;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TabHost;

import java.util.ArrayList;

public class History_Search extends Fragment {

    ListView listview;
    History_SearchAdapter adapter;
    ArrayList<History_Search1> arrayList;

    TabHost tabHost;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.history_search,container,false);


        listview = (ListView)view.findViewById(R.id.listview);
        arrayList = new ArrayList<>();
        arrayList.add(new History_Search1("công nghệ thông tin","21/9/2016"));
        arrayList.add(new History_Search1("công nghệ thông tin","21/9/2016"));
        arrayList.add(new History_Search1("công nghệ thông tin","21/9/2016"));
        arrayList.add(new History_Search1("công nghệ thông tin","21/9/2016"));
        arrayList.add(new History_Search1("công nghệ thông tin","21/9/2016"));

        adapter = new History_SearchAdapter(getActivity(), arrayList, R.layout.history_search_column);
        listview.setAdapter(adapter);

        return view;
    }
}
