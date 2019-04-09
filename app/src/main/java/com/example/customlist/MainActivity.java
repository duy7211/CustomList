package com.example.customlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv = findViewById(R.id.lv);

        ArrayList<clsMoto> motoList = new ArrayList<>();
        motoList.add(new clsMoto("hello","1234",R.drawable.a));
        motoList.add(new clsMoto("hello","1234",R.drawable.b));
        motoList.add(new clsMoto("hello","1234",R.drawable.c));
        MotoAdapter motoAdapter = new MotoAdapter(this,R.layout.row_moto,motoList);
        lv.setAdapter(motoAdapter);
    }
}
