package com.example.wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class WisataAlam extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata_alam);

        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"Pantai Lampuuk", "Pucok Krueng", "Brayen", "Pantai Ulee Lheue","Air Terjun Sarah",
                "Air Terjun Malaka","Air Terjun Seuhom","DreamLife Beach Cafe & Resto", "Maha Corner","Pantai Lhoek Seudu"

        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), lampuuk.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), pucok.class);
                    startActivityForResult(myIntent, 0);
                }


            }
        });
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(WisataAlam.this, MenuUtama.class);
        startActivity(intent);
        finish();
    }
}