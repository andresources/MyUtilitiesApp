package com.myutilities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testtt);
        button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(getApplicationContext(), Class.forName("com.myutil.mymusic.MusicActivity"));
                    startActivity(intent);
                } catch (ClassNotFoundException e) {
                    Toast.makeText(getApplicationContext(),"EE"+e.getMessage(),Toast.LENGTH_LONG).show();
                }
                /*Intent intent = new Intent();
                intent.setClassName(getPackageName(), "com.mypedometer.MainActivity");
                startActivity(intent);*/

            }
        });
    }
}