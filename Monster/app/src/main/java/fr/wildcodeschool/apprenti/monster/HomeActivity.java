package fr.wildcodeschool.apprenti.monster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;


public class HomeActivity extends AppCompatActivity {

    public String MONSTRE =  "fr.wildcodeschool.apprenti.monster.MONSTRE";

   ListView listView;
    String[] itemname = {
            "Fire Lion",
            "Rockilla",
            "Turtle",
            "Panda",
            "Thunder Eagle",
            "Light Spirit",
            "Tyrannoking",
            "Genie",
            "Firesaur",
            "Mersnake",
            "Treezard",
            "Metalsaure"
    };
    Integer[] imageId = {
            R.drawable.btefire,
            R.drawable.bteearth,
            R.drawable.btenature,
            R.drawable.btethunder,
            R.drawable.btemagic,
            R.drawable.btedark,
            R.drawable.btemagic,
            R.drawable.btefire,
            R.drawable.btewater,
            R.drawable.btenature,
            R.drawable.bteearth,
            R.drawable.btedark
    };

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);


       /* ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.mylist, itemname);
        CustomListAdapter adapt = new CustomListAdapter(this, itemname);

        adapt.setAdapter(adapter);*/
        CustomAdapter adapter = new CustomListAdapter(this, itemname, imageId);
        ListView list = (ListView) findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new OnItemClickListener() {
           @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               // String itemValue = (String) listView.getItemAtPosition(position);
//infobulle
               /* Toast.makeText(
                        getApplicationContext(),
                        "Bonjour " + "Le Monstre " + itemValue, Toast.LENGTH_LONG).show();*/
//lien clicable qui renvois sur une page
                Intent intent = new Intent(HomeActivity.this, DetailsActivity.class);
               Bundle mBundle = new Bundle();
               mBundle.putSerializable(MONSTRE,listMonstres.get(position));
                startActivity(intent);


            }
        });
    }

    }