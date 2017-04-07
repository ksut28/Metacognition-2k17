package com.kush.galgotias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class electronics extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronics);
    }
    public void equiz(View v)
    {
        startActivity(
                new Intent(this, electro.class)
        );
    }
    public void emani(View v)
    {
        startActivity(
                new Intent(this, emania.class)
        );
    }
}
