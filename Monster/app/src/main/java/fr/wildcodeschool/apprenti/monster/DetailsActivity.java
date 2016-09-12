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
public class DetailsActivity extends AppCompatActivity {
//variables
    int lifeLion = 3;
    int forceLion = 27;
    int speedLion = 54;
    int energyLion = 34;
//données
    public void ouefLion(View v) {
        lifeLion = 6;
        forceLion = 0;
        speedLion = 10;
        energyLion = 67;
        displayLife(lifeLion);
        displayForce(forceLion);
        displaySpeed(speedLion);
        displayEnergy(energyLion);
    }

    public void babyLion(View v) {
        lifeLion = 6;
        forceLion = 3;
        speedLion = 12;
        energyLion = 78;
        displayLife(lifeLion);
        displayForce(forceLion);
        displaySpeed(speedLion);
        displayEnergy(energyLion);
    }
    public void teenLion(View v) {
        lifeLion = 16;
        forceLion = 23;
        speedLion = 40;
        energyLion = 67;
        displayLife(lifeLion);
        displayForce(forceLion);
        displaySpeed(speedLion);
        displayEnergy(energyLion);
    }
    public void adultLion(View v) {
        lifeLion = 56;
        forceLion = 53;
        speedLion = 140;
        energyLion = 252;
        displayLife(lifeLion);
        displayForce(forceLion);
        displaySpeed(speedLion);
        displayEnergy(energyLion);
    }

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.detail_activity);

    }
    //renvoie les donnes
    public void displayLife(int lifeFire) {
        TextView lifeView = (TextView) findViewById(R.id.life);
        lifeView.setText(String.valueOf(lifeFire));
    }
    public void displayForce(int forceFire) {
        TextView forceView = (TextView) findViewById(R.id.power);
        forceView.setText(String.valueOf(forceFire));
    }
    public void displaySpeed(int speedFire) {
        TextView speedView = (TextView) findViewById(R.id.speed);
        speedView.setText(String.valueOf(speedFire));
    }
    public void displayEnergy(int energyFire) {
        TextView lifeView = (TextView) findViewById(R.id.energy);
        lifeView.setText(String.valueOf(energyFire));
    }
}
