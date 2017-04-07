package com.kush.galgotias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mechanical extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanical);
    }
    public void me1(View v)
    {
        startActivity(
                new Intent(this, designer.class)
        );
    }
    public void b3(View v)
    {
        startActivity(
                new Intent(this, solid.class)
        );
    }

}
