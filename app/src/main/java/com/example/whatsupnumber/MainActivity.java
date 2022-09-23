package com.example.whatsupnumber;

import static com.example.whatsupnumber.R.id.editTextNumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        getSupportActionBar ().hide ();



        Button button = findViewById(R.id.button);
        final EditText editText_mobile = findViewById(R.id.editTextNumber);

        button.setOnClickListener (new View.OnClickListener () {
           @Override
           public void onClick(View view) {
               String mobileNumber = editText_mobile.getText().toString();
               startActivity (new Intent (Intent.ACTION_VIEW, Uri.parse ("http://api.whatsapp.com/send?phone="+"+91"+mobileNumber)));
           }

       });
//        create method that app install or not
//        private boolean appInstallOrNot(String url)
    }
}