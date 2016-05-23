package com.interfaceexample;

import android.content.Context;

/**
 * Created by AKSHAY_SOOD on 23/05/16.
 */
public class CustomModel {
    Context c;
    public void setMessage(String message , Context c) {
        myInterface.onClick(message , c);
    }

    public interface MyInterface {
        public void onClick(String Message , Context c);
    }

    public CustomModel() {
    }

    MyInterface myInterface;
    public static CustomModel instance;
    public String Message;

    public static CustomModel getInstance() {
        if (instance == null) {
            instance = new CustomModel();
        }
        return instance;
    }

    public void setOnClickListener(MyInterface myInterface) {
        this.myInterface = myInterface;
    }


}
