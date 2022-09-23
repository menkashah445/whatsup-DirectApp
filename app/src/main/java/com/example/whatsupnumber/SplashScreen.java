package com.example.whatsupnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {
 ProgressBar progressBar;
 static  int counter =0;
 static  int duration =500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_splash_screen);
        getSupportActionBar ().hide ();
        progressBar.setProgress (R.id.progress_circular);
        progress ();
        start ();
    }
       public void progress(){
         final Timer timer = new Timer ();
         TimerTask timerTask = new TimerTask () {
             @Override
             public void run() {
                 counter++;
              progressBar.setProgress (counter);
              if(counter ==500){
                  timer.cancel ();
              }
             }
         };
         timer.schedule (timerTask,0,100);

       }
    public void start(){
        new Handler ().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent (SplashScreen.this,MainActivity.class));
                                           finish();
                                       }
                                   },
                duration);

       }

}