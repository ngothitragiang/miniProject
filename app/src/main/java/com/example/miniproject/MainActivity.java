package com.example.miniproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button a,b,c,d,e,f,g,h;
String txta,txtb,txtc,txtd,txte,txtf,txtg,txth,strchar;
TextView str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = findViewById(R.id.a);
        b = findViewById(R.id.b);
        c = findViewById(R.id.c);
        d = findViewById(R.id.d);
        e = findViewById(R.id.e);
        f = findViewById(R.id.f);
        g = findViewById(R.id.g);
        h = findViewById(R.id.h);
        str = findViewById(R.id.txtcCharacter);

        txta = a.getText().toString();
        txtb = b.getText().toString();
        txtc = c.getText().toString();
        txtd = d.getText().toString();
        txte = e.getText().toString();
        txtf = f.getText().toString();
        txtg = g.getText().toString();
        txth = h.getText().toString();
        strchar = str.getText().toString();

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txta.equals(strchar)){
                    Toast.makeText(MainActivity.this,"Bạn chon dung roi ne", Toast.LENGTH_SHORT).show();
                    a.setText(" ");
                    str.setText("B");
                }else
                    Toast.makeText(MainActivity.this,"Bạn chon sai roi ne", Toast.LENGTH_SHORT).show();
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtb.equals(strchar)){
                    Toast.makeText(MainActivity.this,"Bạn chon dung roi ne", Toast.LENGTH_SHORT).show();
                    b.setText(" ");
                    str.setText("C");
                }else
                    Toast.makeText(MainActivity.this,"Bạn chon sai roi ne", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
