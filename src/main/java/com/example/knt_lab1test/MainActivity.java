package com.example.knt_lab1test;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;


public class MainActivity extends AppCompatActivity
{
    private TimePicker timePicker;
    public int hours , minutes =0;


    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activty);
        timePicker = (TimePicker) findViewById(R.id.timePicker);
    }



    public void bWitaj_onClickMethod(View view)
    {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            hours = timePicker.getHour();
            minutes = timePicker.getMinute();
        }
        else
        {
            hours = timePicker.getCurrentHour();
            minutes = timePicker.getCurrentMinute();
        }

       Intent intent = new Intent(MainActivity.this,NextActivity.class);
        intent.putExtra("hoursKey",hours);
        intent.putExtra("minutesKey",minutes);
        startActivity(intent);
    }

}
