package com.crm.hieunc.app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    private EditText hoten, tendn, email, password, phone;
    private Button btndk, btnhuy;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_signup);
        anhxa();

        btnhuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    private void anhxa() {
        hoten = (EditText) findViewById(R.id.hoten);
        tendn = (EditText) findViewById(R.id.tendn);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        phone = (EditText) findViewById(R.id.sdt);

        btndk = (Button) findViewById(R.id.btndk);
        btnhuy = (Button) findViewById(R.id.btnhuy);

        btndk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hoten.equals("") || tendn.equals("") || email.equals("") || password.equals("") || phone.equals("")){
                    Toast.makeText(SignUp.this,"không được để trống",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
