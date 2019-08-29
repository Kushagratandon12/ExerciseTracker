package com.example.exercisetracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView Count;
    int CountNumber=0,increment=10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView count = (TextView) findViewById(R.id.Count);
        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(CountNumber>=increment)
                {
                  Toast.makeText(MainActivity.this,"Take 10 min Rest",Toast.LENGTH_LONG);
                  increment=increment+10;
                }
                ++CountNumber;

                TextView count = (TextView) findViewById(R.id.Count);
                count.setText(String.valueOf(CountNumber));
            }

        });

    }
}
