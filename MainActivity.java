package com.example.slip28q2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5,e6;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db=new DatabaseHandler(this);

        b1=(Button) findViewById(R.id.button);
        e1=(EditText) findViewById(R.id.editText);
        e2=(EditText) findViewById(R.id.editText2);
        e3=(EditText) findViewById(R.id.editText3);
        e4=(EditText) findViewById(R.id.editText4);
        e5=(EditText) findViewById(R.id.editText5);
        e6=(EditText) findViewById(R.id.editText6);

        String v1=e1.getText().toString();
        String v2=e2.getText().toString();
        String v3=e3.getText().toString();
        String v4=e4.getText().toString();
        String v5=e5.getText().toString();
        String v6=e6.getText().toString();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("Insert:", "Inserting...");
                db.addContact(new Details(v1,v2,v3,v4,v5,v6));

                Toast.makeText(MainActivity.this, "DATA INSERTED", Toast.LENGTH_LONG).show();
            }
        });
    }
}