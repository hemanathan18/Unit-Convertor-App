package com.example.unitconvertor_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btn;
    TextView txtView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        btn = findViewById(R.id.convertbtn);
        txtView=findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               String input=editText.getText().toString();

               try {
                   double kilos = Double.parseDouble(input);
                   //Converting kilos in to pounds using makeConversion method
                   double pound = makeConversion(kilos);

                   txtView.setText("" + pound + " pounds");
               }
               catch (Exception e)
               {
                   txtView.setText("");
                   Toast.makeText(MainActivity.this,"Invalid input",Toast.LENGTH_LONG).show();
               }

            }
        });


    }

    public double makeConversion(double kilos){

        return kilos*2.20462;
    }
}