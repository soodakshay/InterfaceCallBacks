package com.interfaceexample;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by AKSHAY_SOOD on 23/05/16.
 */
public class secondAct extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        Button button = (Button) findViewById(R.id.b);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               CustomModel.getInstance().setMessage("Hiii" , secondAct.this);

                Log.e("" , "");
            }
        });

    }

}
