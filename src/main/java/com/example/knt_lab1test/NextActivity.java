package com.example.knt_lab1test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class NextActivity extends AppCompatActivity {
    private int pickedHour, pickedMinute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_activty);


        Intent getIntent= getIntent();
         pickedHour = getIntent.getExtras().getInt("hoursKey",0);
         pickedMinute = getIntent.getExtras().getInt("minutesKey",0);

    }

    public void tvWitajBudzik_ClickMethod(View view)
    {
        Toast.makeText(NextActivity.this,"Picked time "+pickedHour+":"+pickedMinute,Toast.LENGTH_LONG).show();
    }
}
