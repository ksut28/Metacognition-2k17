package com.kush.galgotias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class arts extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arts);
    }
    public void ar1(View v)
    {
        startActivity(
                new Intent(this, draw.class)
        );
    }
    public void ar2(View v)
    {
        startActivity(
                new Intent(this, click.class)
        );
    }
    public void ar3(View v)
    {
        startActivity(
                new Intent(this, mad.class)
        );
    }
}
