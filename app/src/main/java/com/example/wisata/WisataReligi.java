package com.example.wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WisataReligi extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_religi);

        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"Masjid Raya Baiturrahman","Makam Sultan Iskandar Muda", "Area Pemakaman Massal Ulee Lheue", "Makam Syiah Kuala", "Masjid Baitu Musyahadah", "Masjid Baiturrahim", "Kuil Palani Andawer", "Masjid Teungku Di Anjong", "Vihara Dharma Bakti", "Gereja Katolik Paroki Hati Kudus"

        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), Masjid.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), Makam.class);
                    startActivityForResult(myIntent, 0);
                }


            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(WisataReligi.this, MenuUtama.class);
        startActivity(intent);
        finish();
    }
}