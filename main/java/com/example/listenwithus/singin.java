package com.example.listenwithus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class singin extends AppCompatActivity {
EditText E,n;
Button butt;
   SharedPreferences sharedpref;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singin);
        E=(EditText)findViewById(R.id.E);
        n=(EditText)findViewById(R.id.n);
        butt=(Button)findViewById(R.id.butt);
       sharedpref=this.getSharedPreferences("name", getApplicationContext().MODE_PRIVATE);
         editor =sharedpref.edit();

    }

    public void Button1(View view) {
        String name=n.getText().toString();
        editor.putString("name",name);
        String email=E.getText().toString();
        editor.putString("email",email);
        editor.commit();
      String getname= sharedpref.getString("name","error1");
        String getemail= sharedpref.getString("email","error2");
        Toast.makeText(getApplicationContext(),name+"       "+email,Toast.LENGTH_LONG).show();
        Intent d = new Intent(getApplicationContext(),buttons.class);
        startActivity(d);


    }

}
