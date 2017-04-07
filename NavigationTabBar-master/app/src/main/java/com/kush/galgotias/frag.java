package com.kush.galgotias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class frag extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag);
    }
    public void f2(View v)
    {
        startActivity(
                new Intent(this, mm.class)
        );
    }

    public void f1(View v)
    {
        startActivity(
                new Intent(this, cocc.class)
        );
    }
    public void f4(View v)
    {
        startActivity(
                new Intent(this, cs.class)
        );
    }
    public void f3(View v)
    {
        startActivity(
                new Intent(this, nfs.class)
        );
    }
}
