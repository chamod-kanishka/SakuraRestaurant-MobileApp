package com.shivtechs.locationpickermodule.Activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.shivtechs.locationpickermodule.R;

import java.util.List;

public class ViewEmployeeActivity extends AppCompatActivity {



    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_employee);







        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        DatabaseHelperClass databaseHelperClass = new DatabaseHelperClass(this);
        List<EmployeeModelClass> employeeModelClasses = databaseHelperClass.getEmployeeList();

        if (employeeModelClasses.size() > 0){
            EmployeeAdapterClass employeadapterclass = new EmployeeAdapterClass(employeeModelClasses,ViewEmployeeActivity.this);
            recyclerView.setAdapter(employeadapterclass);
        }else {
            Toast.makeText(this, "There is no orders in the database", Toast.LENGTH_SHORT).show();
        }




    }




}
