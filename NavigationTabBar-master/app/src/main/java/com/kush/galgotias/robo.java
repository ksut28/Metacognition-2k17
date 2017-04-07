package com.kush.galgotias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class robo extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robo);
    }
    public void r2(View v)
    {
        startActivity(
                new Intent(this, maze.class)
        );
    }
    public void r4(View v)
    {
        startActivity(
                new Intent(this, cruiser.class)
        );
    }
    public void r3(View v)
    {
        startActivity(
                new Intent(this, soccer.class)
        );
    }
    public void r1(View v)
    {
        startActivity(
                new Intent(this, rann.class)
        );
    }
}
