package com.pramedia.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv;
    private ArrayList<Mahasiswa> data = new ArrayList<>();
    private Adaptermhs adaptermhs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv);

        adaptermhs = new Adaptermhs(data, MainActivity.this);
        RecyclerView.LayoutManager layRV = new LinearLayoutManager(MainActivity.this);
        rv.setLayoutManager(layRV);
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.setAdapter(adaptermhs);

        setData("01", "Rampa", "Sistem Informasi");
        setData("02", "Tulus", "Sistem Informasi");
        setData("03", "Atika", "Sistem Informasi");
    }

    private void setData(String nim,String  nama, String  prodi) {
        Mahasiswa obj = new Mahasiswa(nim, nama, prodi);

        data.add(obj);
        adaptermhs.notifyDataSetChanged();
    }
}