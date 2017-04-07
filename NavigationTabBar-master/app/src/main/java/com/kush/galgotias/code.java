package com.kush.galgotias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class code extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);
    }
    public void blind(View v)
    {
        startActivity(
                new Intent(this, blindcoding.class)
        );
    }
    public void bug(View v)
    {
        startActivity(
                new Intent(this, spotdbug.class)
        );
    }
    public void surf(View v)
    {
        startActivity(
                new Intent(this, surfing.class)
        );
    }
    public void encript(View v)
    {
        startActivity(
                new Intent(this, encription.class)
        );
    }
    public void java(View v)
    {
        startActivity(
                new Intent(this, java.class)
        );
    }
    public void b7(View v)
    {
        startActivity(
                new Intent(this, zph.class)
        );
    }
    public void b8(View v)
    {
        startActivity(
                new Intent(this, loop.class)
        );
    }
}
