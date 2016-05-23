package com.interfaceexample;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CustomModel.MyInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomModel.getInstance().setOnClickListener(this);
        startActivity(new Intent(this , secondAct.class));
    }


    @Override
    public void onClick(String Message , Context cOntext) {
        Toast.makeText(this, Message, Toast.LENGTH_SHORT).show();
        ((secondAct)cOntext).finish();

    }
}
