package com.example.wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WisataKuliner extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_kuliner);

        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"Canai Mamak KL","Sate Matang Dwan","Seafood Karibia","Imperial Kitchen","Daus Nasi Goreng Aceh","Warung Nasi Hasan","Warung Nasi Aceh Tulen","Restoran Banda Seafood","Restoran Mie Razali","Mie Ayah Simpang Lhong Raya"

        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Canai.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), sate.class);
                    startActivityForResult(myIntent, 0);
                }


            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(WisataKuliner.this, MenuUtama.class);
        startActivity(intent);
        finish();
    }
}