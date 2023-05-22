package com.example.wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WisataEdukasi extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_edukasi);

        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"Museum Tsunami Aceh","Museum PLTD Apung","Taman Putroe Phang",
                "Rumah Adat Aceh", "Hutan Kota BNI","Taman Wisata Meraxa",
                "Taman Sulthanah Safiatuddin","Rumah Chut Nyak Dhien","Gunongan","Pinto Khop"

        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), MuseumTsunami.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), pltd.class);
                    startActivityForResult(myIntent, 0);
                }


            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(WisataEdukasi.this, MenuUtama.class);
        startActivity(intent);
        finish();
    }
}