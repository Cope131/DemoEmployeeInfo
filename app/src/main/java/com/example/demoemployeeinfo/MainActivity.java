package com.example.demoemployeeinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvEmployeeInfo;
    MyAdapter myAdapter;
    ArrayList<Employee> employeeInfoList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //binding
        lvEmployeeInfo = findViewById(R.id.listViewEmployeeInfo);

        //initialize adapter
        myAdapter = new MyAdapter(this, R.layout.row, employeeInfoList);

        //bridging
        lvEmployeeInfo.setAdapter(myAdapter);

        //add items
        employeeInfoList.add(new Employee("John", "Technical Leader", 3400.0));
        employeeInfoList.add(new Employee("May", "Programmer", 2200.0));

    }
}