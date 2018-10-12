package com.example.user.rightwear;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class Order extends AppCompatActivity {

    Bundle data;
    //Cursor res;
    Button b1;
    String name1,design;
    EditText e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12;
    TextView e13,e14;
   Order1 order1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        data = getIntent().getExtras();
        name1 = data.getString("name");
        design= data.getString("design");

        order1=new Order1(this);


        b1=(Button)findViewById(R.id.b3);
        e14=(TextView) findViewById(R.id.editText19);
        e13=(TextView)findViewById(R.id.editText18);
        e1=(EditText)findViewById(R.id.editText6);
        e2=(EditText)findViewById(R.id.editText7);
        e3=(EditText)findViewById(R.id.editText8);
        e4=(EditText)findViewById(R.id.editText9);
        e5=(EditText)findViewById(R.id.editText10);
        e6=(EditText)findViewById(R.id.editText11);
        e7=(EditText)findViewById(R.id.editText12);
        e8=(EditText)findViewById(R.id.editText13);
        e9=(EditText)findViewById(R.id.editText14);
        e10=(EditText)findViewById(R.id.editText15);
        e11=(EditText)findViewById(R.id.editText16);
        e12=(EditText)findViewById(R.id.editText17);

        e13.setText(design);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s13 =design;
                String s1 = e1.getText().toString();
                String s2 = e2.getText().toString();
                String s3 = e3.getText().toString();
                String s4 = e4.getText().toString();
                String s5 = e5.getText().toString();
                String s6 = e6.getText().toString();
                String s7 = e7.getText().toString();
                String s8 = e8.getText().toString();
                String s9 = e9.getText().toString();
                String s10 = e10.getText().toString();
                String s11 = e11.getText().toString();
                String s12 = e12.getText().toString();
                String s14=e14.getText().toString();

                if (s1.equals("") || s2.equals("") || s3.equals("") || s4.equals("") || s5.equals("") || s6.equals("") || s7.equals("") || s8.equals("") || s9.equals("") || s10.equals("") || s11.equals("") || s12.equals("") || s13.equals("") ||s14.equals(""))

                {
                    Toast.makeText(getApplicationContext(), " fields are empty", Toast.LENGTH_LONG).show();

                }
                else{
                Boolean insert = order1.insert(s13, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12,s14,name1);
                if (insert == true) {
                    Toast.makeText(Order.this, "ORDER PLACED", Toast.LENGTH_LONG).show();

                }
                else{

                    Toast.makeText(Order.this, "ORDER NOT PLACED", Toast.LENGTH_LONG).show();


                }


                }

            }


        });



    }

}
