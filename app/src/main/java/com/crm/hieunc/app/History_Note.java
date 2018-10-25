package com.crm.hieunc.app;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class History_Note extends Fragment {

    ListView lisviewNote;
    ArrayList<String> arrayList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.history_note, container, false);

        lisviewNote = (ListView) view.findViewById(R.id.listview);
        arrayList = new ArrayList<>();

        arrayList.add("công nghệ thông tin");
        arrayList.add("điện tử viễn thông");
        arrayList.add("công nghệ thông tin");
        arrayList.add("công nghệ thông tin");
        arrayList.add("điện tử viễn thông");
        arrayList.add("công nghệ thông tin");
        arrayList.add("công nghệ thông tin");
        arrayList.add("điện tử viễn thông");
        arrayList.add("công nghệ thông tin");
        arrayList.add("công nghệ thông tin");
        arrayList.add("điện tử viễn thông");
        arrayList.add("công nghệ thông tin");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                arrayList
        );
        lisviewNote.setAdapter(adapter);
        return view;
    }
}
