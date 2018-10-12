package com.example.user.rightwear;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class Gallery extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

    }

     public void i1(View view){
         Intent u=new Intent(Gallery.this,Order.class);
         startActivity(u);
     }

    public void i2(View view){
        Intent u=new Intent(Gallery.this,Order.class);
        startActivity(u);
    }

    public void i3(View view){
        Intent u=new Intent(Gallery.this,Order.class);
        startActivity(u);
    }

    public void i4(View view){
        Intent u=new Intent(Gallery.this,Order.class);
        startActivity(u);
    }

    public void i5(View view){
        Intent u=new Intent(Gallery.this,Order.class);
        startActivity(u);
    }

}
