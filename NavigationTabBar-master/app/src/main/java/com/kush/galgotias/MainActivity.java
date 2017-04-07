package com.kush.galgotias;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorListener;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends Activity
{
    ImageView iv;
    private ImageView image1;
    private int[] imageArray;
    private int currentIndex;
    private int startIndex;
    private int endIndex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv=(ImageView)findViewById(R.id.imageView);
        iv.setImageResource(R.drawable.logoname);
        image1 = (ImageView)findViewById(R.id.imageView2);
        imageArray = new int[8];
        imageArray[0] = R.drawable.x1;
        imageArray[1] = R.drawable.x2;
        imageArray[2] = R.drawable.x3;
        imageArray[3] = R.drawable.x4;
        imageArray[4] = R.drawable.x5;
        imageArray[5] = R.drawable.x6;
        imageArray[3] = R.drawable.x7;
        imageArray[4] = R.drawable.x8;
        imageArray[5] = R.drawable.x9;
       // imageArray[6] = R.drawable.seven;
        //imageArray[7] = R.drawable.eight;

        startIndex = 0;
        endIndex = 5;
        nextImage();

    }
    public void nextImage(){
        image1.setImageResource(imageArray[currentIndex]);
       // Animation rotateimage = AnimationUtils.loadAnimation(this, R.anim.custom_anim);
        //image1.startAnimation(rotateimage);
        currentIndex++;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(currentIndex>endIndex){
                    currentIndex=startIndex;
                    nextImage();
                }else{
                    nextImage();
                }

            }
        },3000); // here 1000(1 second) interval to change from current  to next image

    }

    public void click(View v) {

        startActivity(
                new Intent(MainActivity.this, HorizontalNtbActivity.class)
        );
    }


    }
