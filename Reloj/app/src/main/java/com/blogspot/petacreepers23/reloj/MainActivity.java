package com.blogspot.petacreepers23.reloj;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.blogspot.petacreepers23.widget.CustomFontTextView;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Nos aseguramos de que desde la priemra ejecucion está la hora puesta
        CustomFontTextView textoClock = (CustomFontTextView)findViewById(R.id.texto);
        Calendar c = Calendar.getInstance();
        int hora = c.get(Calendar.HOUR_OF_DAY);
        int minuto = c.get(Calendar.MINUTE);
        int segundo = c.get(Calendar.SECOND);
        textoClock.setText(hora+":"+minuto+":"+segundo);
        updateDisplay();
    }

    private void updateDisplay(){
        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        CustomFontTextView textoClock = (CustomFontTextView)findViewById(R.id.texto);
                        Calendar c = Calendar.getInstance();
                        int hora = c.get(Calendar.HOUR_OF_DAY);
                        int minuto = c.get(Calendar.MINUTE);
                        int segundo = c.get(Calendar.SECOND);
                        textoClock.setText(String.format("%02d",hora)+":"+String.format("%02d",minuto)+":"+String.format("%02d",segundo));
                    }
                });
            }
        },0,1000);
    }

}
