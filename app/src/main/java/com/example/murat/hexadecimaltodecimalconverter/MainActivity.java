package com.example.murat.hexadecimaltodecimalconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et;
    TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         et=(EditText)findViewById(R.id.et);
         tv1 = (TextView)findViewById(R.id.tv1);
        Button bt =(Button)findViewById(R.id.button);
        Button btClear =(Button)findViewById(R.id.buttonClear);


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              try {
                  String s = et.getText().toString();
                  String[] F = s.split(" ");
                  String last = F[F.length - 1];

                  int i = Integer.parseInt(last, 16);
                  tv1.setText(i + "");

              }
              catch (Exception e){
                  Toast.makeText(getApplicationContext(),"hatali giris",Toast.LENGTH_LONG).show();

                  tv1.setText("HATALI GİRİŞ !!!");

              }
            }
        });


        btClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           tv1.setText(" ");
            et.setText(" ");
            }
        });



    }

}
