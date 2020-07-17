package com.example.demoemployeeinfo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends ArrayAdapter {

    Context parentContext;
    int layoutId;
    ArrayList<Employee> employeeArrayList;

    public MyAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Employee> objects) {
        super(context, resource, objects);
        parentContext = context;
        layoutId = resource;
        employeeArrayList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parentContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layoutId, parent, false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvSalary = rowView.findViewById(R.id.textViewSalary);

        Employee currentEmployee = employeeArrayList.get(position);

        tvName.setText(currentEmployee.getName());
        tvTitle.setText(currentEmployee.getTitle());
        tvSalary.setText(currentEmployee.getSalary() + "");

        return rowView;
    }
}
