package com.example.drawyourownnote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AddNewPaintActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        PaintView paintView = new PaintView(this);

        setContentView(paintView);

    }
}
