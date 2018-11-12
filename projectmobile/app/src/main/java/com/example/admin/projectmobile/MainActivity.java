package com.example.admin.projectmobile;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

       if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT){
            Window w = getWindow();
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
       }

       Button buttonregister = (Button) findViewById(R.id.button_register);
       buttonregister.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Register2.class);
                startActivity(intent);
            }
        });
    }
}
