package com.example.androidproject;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    ListView lsvHomeSanPham;
    ArrayList<HomeSanPham> homeSanPhams;
    HomeSanPhamAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        anhXa();
        adapter = new HomeSanPhamAdapter(this, R.layout.home_item_listview, homeSanPhams);
        lsvHomeSanPham.setAdapter(adapter);
    }
    private void anhXa(){
        lsvHomeSanPham= (ListView) findViewById(R.id.lsv_home);
        homeSanPhams = new ArrayList<>();

        // tạo theo constructor
        homeSanPhams.add(new HomeSanPham("CATAN", "Rèm phòng khách","Chi tiết", R.drawable.catanshop));
        homeSanPhams.add(new HomeSanPham("CATAN", "Rèm phòng khách","Chi tiết", R.drawable.catanshop));
        homeSanPhams.add(new HomeSanPham("CATAN", "Rèm phòng khách","Chi tiết", R.drawable.catanshop));
        homeSanPhams.add(new HomeSanPham("CATAN", "Rèm phòng khách","Chi tiết", R.drawable.catanshop));

    }
}
