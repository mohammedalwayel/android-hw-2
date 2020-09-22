package com.example.a11;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Interpolator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText e1 = findViewById(R.id.editTextTextPersonName);
        final EditText e2 = findViewById(R.id.editTextTextPersonName4);
        final EditText e3 = findViewById(R.id.editTextTextPersonName3) ;
        final EditText e4 = findViewById(R.id.editTextTextPersonName2) ;
        final TextView e5 = findViewById(R.id.Result);
        Button   b1 = findViewById(R.id.button)  ;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Integer.parseInt(e1.getText().toString());
                //Integer.parseInt(e2.getText().toString());
               // Integer.parseInt(e3.getText().toString());
                //Integer.parseInt(e4.getText().toString());

              int n1 =  Integer.parseInt(e1.getText().toString());
             int n2 =    Integer.parseInt(e2.getText().toString());
            int n3  =    Integer.parseInt(e3.getText().toString());
            int n4 =    Integer.parseInt(e4.getText().toString());
            int mohammed = n1+ n2 + n3 + n4 ;
          e5.setText(mohammed+"");


            }
        });




    }
}