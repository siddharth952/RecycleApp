package com.example.recycleapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: started!");
    }


    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps");

        mImageUrls.add("https://i.imgur.com/tfkbynm.jpg");
        mNames.add("top1");

        mImageUrls.add("https://i.imgur.com/492cL59.jpg");
        mNames.add("top2");
        mImageUrls.add("https://i.imgur.com/0VFXHDx.jpg");
        mNames.add("top3");
        mImageUrls.add("https://i.imgur.com/dDPToWJ.jpg");
        mNames.add("top4");
        mImageUrls.add("https://i.imgur.com/Ac4zRbe.jpg");
        mNames.add("top5");
        mImageUrls.add("https://i.imgur.com/QEyrBh0.jpg");
        mNames.add("top6");


        initRecyclerView();

    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recycleview.");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,mNames,mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }


}
