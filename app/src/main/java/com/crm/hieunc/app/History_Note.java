package com.crm.hieunc.app;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class History_Note extends Fragment {
    ListView listHistory;
    ArrayList<String> list;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.history_note, container, false);

        listHistory = (ListView) view.findViewById(R.id.listHistory);
        list = new ArrayList<String>();
        list.add("lập trình php");
        list.add("lập trình android");
        list.add("lập trình Ruby");
        list.add("lập trình Java");
        list.add("lập trình python");
        list.add("lập trình php");
        list.add("lập trình android");
        list.add("lập trình Ruby");
        list.add("lập trình Java");
        list.add("lập trình python");
        list.add("lập trình php");
        list.add("lập trình android");
        list.add("lập trình Ruby");
        list.add("lập trình Java");
        list.add("lập trình python");
        list.add("lập trình php");
        list.add("lập trình android");
        list.add("lập trình Ruby");
        list.add("lập trình Java");
        list.add("lập trình python");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, list);
        listHistory.setAdapter(adapter);

        listHistory.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                showdialog();
            }
        });
        return view;
    }

    public void showdialog() {
        final Dialog dialog = new Dialog(getActivity());

        dialog.setContentView(R.layout.showdialog_historynote);
        dialog.setCanceledOnTouchOutside(false);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
        TextView txtClose;
        LinearLayout xoabv, xemct, xemvt;
        txtClose = (TextView) dialog.findViewById(R.id.close);
        xoabv = (LinearLayout)dialog.findViewById(R.id.xoabaiviet);
        xemct = (LinearLayout)dialog.findViewById(R.id.xemchitiet);
        xemvt = (LinearLayout)dialog.findViewById(R.id.xemvitri);
        txtClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        xemct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                Intent intent1 = new Intent(getActivity(),Detail.class);
                startActivity(intent1);
            }
        });

        xoabv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                Toast.makeText(getActivity(),"Xóa bài viết thành công",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
