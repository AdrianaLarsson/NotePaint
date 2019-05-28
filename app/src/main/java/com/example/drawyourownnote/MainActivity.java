package com.example.drawyourownnote;

import android.animation.FloatArrayEvaluator;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

FloatingActionButton floatingActionButtonPaint;
FloatingActionButton floatingActionButtonNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // when user clicks on floatbutton paint, it comes to paint activity
        floatingActionButtonPaint = (FloatingActionButton) findViewById(R.id.floatingActionButtonPaint);

        floatingActionButtonPaint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), AddNewPaintActivity.class);
                startActivityForResult(intent, -1);

            }
        });

        floatingActionButtonNote = (FloatingActionButton) findViewById(R.id.floatingActionButtonNote);

        floatingActionButtonNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), AddNewNoteActivity.class);
                startActivityForResult(intent, -1);

            }
        });



    }
}
