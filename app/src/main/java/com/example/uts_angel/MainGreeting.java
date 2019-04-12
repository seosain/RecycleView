package com.example.uts_angel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainGreeting extends AppCompatActivity {
    private RecyclerView recyclerView;
    private greeting_adapter adapter;
    private ArrayList<greeting> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new greeting_adapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainGreeting.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new greeting("halo", "Kon'nichiwa"));
        mahasiswaArrayList.add(new greeting("selamat pagi", "ohayo"));
        mahasiswaArrayList.add(new greeting("selamat siang", "Kon'nichiwa"));
        mahasiswaArrayList.add(new greeting("selamat malam", "konbawa"));
        mahasiswaArrayList.add(new greeting("apa kabar", "ogenkidesuka"));
        mahasiswaArrayList.add(new greeting("saya", "wathasi"));
        mahasiswaArrayList.add(new greeting("kamu", "anata"));
    }
}
