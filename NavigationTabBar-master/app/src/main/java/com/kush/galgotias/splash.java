package com.kush.galgotias;

/**
 * Created by ghost rider on 9/10/2016.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;


public class splash extends Activity {
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);


        Thread timerThread = new Thread(){
            public void run(){
                try{

                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(splash.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }

}