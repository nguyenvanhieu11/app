package com.crm.hieunc.app;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class Login extends Fragment {

    EditText username, password;
    Button btndangnhap, btnhuy, btndangky;
    CheckBox remember;
    TextView quenmatkhau;

    SharedPreferences sharedpreferences;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.loginandsignin, container, false);


        username = (EditText) view.findViewById(R.id.username);
        password = (EditText) view.findViewById(R.id.password);
        remember = (CheckBox) view.findViewById(R.id.remember);
        btndangnhap = (Button) view.findViewById(R.id.dangnhap);
        btnhuy = (Button) view.findViewById(R.id.huy);
        btndangky = (Button) view.findViewById(R.id.dangky);
        quenmatkhau = (TextView)view.findViewById(R.id.quenmk);

        sharedpreferences = this.getActivity().getSharedPreferences("datalogin", Context.MODE_PRIVATE);

        username.setText(sharedpreferences.getString("username",""));
        password.setText(sharedpreferences.getString("password",""));
        remember.setChecked(sharedpreferences.getBoolean("checked",false));

        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();

                if (user.equals("") || pass.equals("")) {
                    Toast.makeText(getActivity(), "Bạn cần điền đầy đủ thông tin !", LENGTH_LONG).show();
                } else if (user.equals("hieunv") && pass.equals("hieu31071998")) {

                    if(remember.isChecked()){
                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.putString("username",user);
                        editor.putString("password",pass);
                        editor.putBoolean("checked",true);
                        editor.commit();
                    }else{
                        SharedPreferences.Editor editor = sharedpreferences.edit();
                        editor.remove("username");
                        editor.remove("password");
                        editor.remove("checked");
                        editor.commit();
                    }

                    Toast.makeText(getActivity(),"Đăng nhập thành công",Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getActivity(), "Sai tên đăng nhập mật khẩu !", LENGTH_LONG).show();
                }
            }
        });

        btnhuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),HomePage.class);
                startActivity(intent);
            }
        });

        btndangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getActivity(),SignUp.class);
                startActivity(intent1);
            }
        });

        quenmatkhau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quenmk = new Intent(getActivity(),Quen_MK.class);
                startActivity(quenmk);
            }
        });

        return view;
    }

}
