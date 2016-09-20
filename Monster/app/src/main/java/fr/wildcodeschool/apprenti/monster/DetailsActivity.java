package fr.wildcodeschool.apprenti.monster;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * Created by apprenti on 09/09/16.
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //on récupère notre Monstre
        Monstre mMonstre = (Monstre) getIntent().getSerializableExtra(HomeActivity.MONSTRE);

        //on récupère les élements du layout
        final Stats statsEvo1 = mMonstre.getEvo1();
        final Stats statsEvo2 = mMonstre.getEvo2();
        final Stats statsEvo3 = mMonstre.getEvo3();

        final TextView txtLife = (TextView) findViewById(R.id.life);
        final TextView txtPower = (TextView) findViewById(R.id.power);
        final TextView txtSpeed = (TextView) findViewById(R.id.speed);
        final TextView txtStamina = (TextView) findViewById(R.id.stamina);

        TextView txtTitle = (TextView) findViewById(R.id.textTitle);
        ImageView imageEgg = (ImageView) findViewById(R.id.imageEgg);
        TextView txtElem = (TextView) findViewById(R.id.txtElem);

        ImageView imageEvo0 = (ImageView) findViewById(R.id.imageEvo0);
        ImageButton btnEvo1 = (ImageButton) findViewById(R.id.btnEvo1);
        ImageButton btnEvo2 = (ImageButton) findViewById(R.id.btnEvo2);
        ImageButton btnEvo3 = (ImageButton) findViewById(R.id.btnEvo3);

        //On affiche nos valeurs
        txtTitle.setText(mMonstre.getName());
        imageEgg.setImageResource(mMonstre.getEgg());
        txtElem.setText(mMonstre.getElement());

        txtLife.setText(Integer.toString(statsEvo1.getLife()));
        txtPower.setText(Integer.toString(statsEvo1.getPower()));
        txtSpeed.setText(Integer.toString(statsEvo1.getSpeed()));
        txtStamina.setText(Integer.toString(statsEvo1.getStamina()));

        imageEvo0.setImageResource(mMonstre.getEgg());
        btnEvo1.setImageResource(statsEvo1.getImg());
        btnEvo2.setImageResource(statsEvo2.getImg());
        btnEvo3.setImageResource(statsEvo3.getImg());

        //Gestion click des evolutions et change les valeurs en fonction
        btnEvo1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                txtLife.setText(Integer.toString(statsEvo1.getLife()));
                txtPower.setText(Integer.toString(statsEvo1.getPower()));
                txtSpeed.setText(Integer.toString(statsEvo1.getSpeed()));
                txtStamina.setText(Integer.toString(statsEvo1.getStamina()));
            }
        });
        btnEvo2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                txtLife.setText(Integer.toString(statsEvo2.getLife()));
                txtPower.setText(Integer.toString(statsEvo2.getPower()));
                txtSpeed.setText(Integer.toString(statsEvo2.getSpeed()));
                txtStamina.setText(Integer.toString(statsEvo2.getStamina()));
            }
        });
        btnEvo3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                txtLife.setText(Integer.toString(statsEvo3.getLife()));
                txtPower.setText(Integer.toString(statsEvo3.getPower()));
                txtSpeed.setText(Integer.toString(statsEvo3.getSpeed()));
                txtStamina.setText(Integer.toString(statsEvo3.getStamina()));
            }
        });
    }
}