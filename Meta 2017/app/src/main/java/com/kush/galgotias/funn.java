package com.kush.galgotias;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class funn extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun);
    }
    public void b1(View v)
    {
        startActivity(
                new Intent(this, nerd.class)
        );
    }
    public void b2(View v)
    {
        startActivity(
                new Intent(this, draw.class)
        );
    }

    public void b4(View v)
    {
        startActivity(
                new Intent(this, click.class)
        );
    }
    public void b5(View v)
    {
        startActivity(
                new Intent(this, designer.class)
        );
    }
    public void b6(View v)
    {
        startActivity(
                new Intent(this, electro.class)
        );
    }

    public void b8(View v)
    {
        startActivity(
                new Intent(this, rubiks.class)
        );
    }
    public void b9(View v)
    {
        startActivity(
                new Intent(this, mad.class)
        );
    }
    public void b10(View v)
    {
        startActivity(
                new Intent(this, treasure.class)
        );
    }
    public void f4(View v)
    {
        startActivity(
                new Intent(this, sudoku.class)
        );
    }
    public void f3(View v)
    {
        startActivity(
                new Intent(this, chess.class)
        );
    }

}
