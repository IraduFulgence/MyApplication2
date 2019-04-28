package com.fulgence.myapplication2;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class DishActivity extends AppCompatActivity {
    int IMAGES[] = {R.drawable.chicken,R.drawable.pizza,R.drawable.burger,R.drawable.rwanda,R.drawable.pork};
    String LISTS[] =  {"Chicken beef","Royal Pizza","Humberger","Rwandan dish","Pork"};
    String DETAILS[] ={"Price ----------->15000FR","Price ----------->5000FR","Price ----------->1500FR","Price ----------->1500FR","Price ----------->10000R"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dish);
        ListView listView = findViewById(R.id.kib);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
    }
    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {

            return IMAGES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            @SuppressLint("ViewHolder") View view = getLayoutInflater().inflate(R.layout.customlayout,null);
            ImageView imageView = findViewById(R.id.imageView);
            TextView textview_name = findViewById(R.id.textview_name);
            TextView textview_details= findViewById(R.id.textview_details);
            imageView.setImageResource(IMAGES[position]);
            textview_name.setText(LISTS[position]);
            textview_details.setText(DETAILS[position]);


            return view;
        }
    }
}
