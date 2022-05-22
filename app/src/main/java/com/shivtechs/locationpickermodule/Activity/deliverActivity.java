package com.shivtechs.locationpickermodule.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.shivtechs.locationpickermodule.R;

public class deliverActivity extends AppCompatActivity {

    EditText editText_name,editText_email, editText_price,editText_location ;
    Button button_add,button_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deliver);

        editText_name = findViewById(R.id.edittext_name);
        editText_email = findViewById(R.id.edittext_email);
        editText_price = findViewById(R.id.edittext_price);
        editText_location = findViewById(R.id.edittext_location);

        button_add = findViewById(R.id.button_add);
        button_view = findViewById(R.id.button_view);

        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringName = editText_name.getText().toString();
                String stringEmail = editText_email.getText().toString();
                String stringPrice = editText_price.getText().toString();
                String stringLocation = editText_location.getText().toString();


                if (stringName.length() <=0 || stringEmail.length() <=0){
                    Toast.makeText(deliverActivity.this, "Enter All Data", Toast.LENGTH_SHORT).show();
                }else {
                    DatabaseHelperClass databaseHelperClass = new DatabaseHelperClass(deliverActivity.this);
                    EmployeeModelClass employeeModelClass = new EmployeeModelClass(stringName,stringEmail,stringPrice,stringLocation);
                    databaseHelperClass.addEmployee(employeeModelClass);
                    Toast.makeText(deliverActivity.this, "Add Order Successfully", Toast.LENGTH_SHORT).show();
                    finish();
                    startActivity(getIntent());
                }
            }
        });


        button_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(deliverActivity.this,ViewEmployeeActivity.class);
                startActivity(intent);
            }
        });





    }
}
