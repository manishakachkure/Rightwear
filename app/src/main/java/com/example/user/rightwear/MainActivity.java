package com.example.user.rightwear;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;
    EditText e1,e2;
    DatabaseHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db=new DatabaseHelper(this);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.register);

        //will operate when button b1 will be hit
	b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=e1.getText().toString().trim();
                String password=e2.getText().toString().trim();
                Boolean chkemailpass=db.emailpassword(email,password);
                if(chkemailpass==true){

                    Toast.makeText(getApplicationContext(),"login successful",Toast.LENGTH_LONG).show();
                    Intent g=new Intent(MainActivity.this,Login.class);
                    g.putExtra("name",email);
                    startActivity(g);

                }
                else if (email.contentEquals("Admin") && password.contentEquals("admin")){
                    Intent g=new Intent(MainActivity.this,AdminPage.class);
                    startActivity(g);
                }

                else{
                    Toast.makeText(getApplicationContext(),"Wrong email or password",Toast.LENGTH_LONG).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Register.class);
                startActivity(i);
            }
        });
    }
}
