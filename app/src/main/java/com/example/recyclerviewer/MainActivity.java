package com.example.recyclerviewer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView mrecyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass>userList;
    Adapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        initData();
        initRecyclerView();
    }

    private void initRecyclerView() {
        mrecyclerView=findViewById(R.id.recyclerViewer);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        mrecyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        mrecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();




    }
    private void initData() {
        userList = new ArrayList<>();

        userList.add(new ModelClass(R.drawable.faizan,"Faizan","How are you?","1:45 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.huzaifa,"Huzaifa","I am fine","15:08 pm","_______________________________________"));

        userList.add(new ModelClass(R.drawable.muzamil,"Muzamil","You Know?","1:02 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.khushi,"Khushi","How are you?","12:55 pm","_______________________________________"));

        userList.add(new ModelClass(R.drawable.pakistan,"Abu","This is Easy","13:50 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.usman,"Usman","I am Don","1:08 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.sameer,"Sameer","You Know this?","3:02 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.awais,"Awais","How ?","1:55 pm","_______________________________________"));

        userList.add(new ModelClass(R.drawable.ahmad,"Ahmad","How are you?","20:05 am","_______________________________________"));

        userList.add(new ModelClass(R.drawable.unk,"Unkown","????","20:05 am","_______________________________________"));





    }


}