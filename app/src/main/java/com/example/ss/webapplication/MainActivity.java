package com.example.ss.webapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView t;
    //@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addListenerOnButton();
    }
    public void addListenerOnButton() {
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
         public void onClick(View view) {
             Intent browserIntent =
                     new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
             startActivity(browserIntent);
         }
     });
    }
}
