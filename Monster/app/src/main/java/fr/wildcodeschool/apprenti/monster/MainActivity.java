package fr.wildcodeschool.apprenti.monster;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

   ListView listView;

    @Override
            protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list);


        String[] itemname = new String[]{
                "Fire Lion", "Rockilla", "Turtle", "Panda", "Thunder Eagle", "Light Spirit", "Tyrannoking", "Genie", "Firesaur", "Mersnake", "Treezard", "Metalsaure"
        };

        Integer[] imgid={
                R.drawable.btedark,
                R.drawable.bteearth,
                R.drawable.btedark,
                R.drawable.bteearth,
                R.drawable.btedark,
                R.drawable.bteearth,

        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, itemname);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int itemPosition = position;

                String itemValue = (String) listView.getItemAtPosition(position);
//infobulle
                Toast.makeText(
                  getApplicationContext(),
                        "Bonjour " + "Le Monstre " + itemValue, Toast.LENGTH_LONG).show();
//lien clicable qui renvois sur une page
                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                startActivity(intent);


            }
        });

    }

}


