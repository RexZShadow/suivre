package com.example.ljimutan.suivre;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_test);



        //get button
        Button btn = (Button) findViewById(R.id.testButton);

        //button click
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MyApp", "Button Clicked!");
                Toast.makeText(getApplicationContext(), "Suivre Means To Follow!", Toast.LENGTH_SHORT)
                        .show();
            }
        });

    }
}
