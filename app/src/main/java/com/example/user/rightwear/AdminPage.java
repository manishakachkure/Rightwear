package com.example.user.rightwear;

import android.app.AlertDialog;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Date;

import static java.lang.System.out;

public class AdminPage extends AppCompatActivity {
    Order1 order1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_page);
        order1 = new Order1(this);
    }
    public void viewAll(View view)
    {
        Cursor res=order1.getAllData();//res have some property
        if(res.getCount()==0)
        {
            //Errormessage
            showMessage("Error","No data to show");
            return;
        }
        else
        {
            //create some string buffer
            StringBuffer buffer=new StringBuffer();
            while (res.moveToNext())
            {
                buffer.append("id:"+res.getString(0)+"\n");
                buffer.append("Name:"+res.getString(14)+"\n");
                buffer.append("design:"+res.getString(1)+"\n");
                buffer.append("Neckline:"+res.getString(2)+"\n");
                buffer.append("Shoulder:"+res.getString(3)+"\n");
                buffer.append("Chest:"+res.getString(4)+"\n");
                buffer.append("Arm Hole:"+res.getString(5)+"\n");
                buffer.append("Waist:"+res.getString(6)+"\n");
                buffer.append("Stomach:"+res.getString(7)+"\n");
                buffer.append("Hip:"+res.getString(8)+"\n");
                buffer.append("Thigh:"+res.getString(9)+"\n");
                buffer.append("Calf:"+res.getString(10)+"\n");
                buffer.append("Knee:"+res.getString(11)+"\n");
                buffer.append("Ankle Hem:"+res.getString(12)+"\n");
                buffer.append("Upper Bust:"+res.getString(13)+"\n\n");
                // buffer.append("DOB:"+res.getString(4)+"\n\n");
                out.print("Date is:"+ "java.sql.Date");
            }
            //show all data
            showMessage("Data ",buffer.toString());
        }



    }
    public void showMessage(String title,String msg)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);//can cancel it after use
        builder.setTitle(title);
        builder.setMessage(msg);
        builder.show();

    }
}
