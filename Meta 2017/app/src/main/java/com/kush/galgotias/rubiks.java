package com.kush.galgotias;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class rubiks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rubiks);
        TextView tv1=(TextView)findViewById(R.id.textView7);
        tv1.setText(R.string.your_string);
        TextView tv2=(TextView)findViewById(R.id.textView9);
        tv2.setText(R.string.your_string1);
    }
}
