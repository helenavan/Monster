package fr.wildcodeschool.apprenti.monster;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

/**
 * Created by apprenti on 09/09/16.
 */
public class DetailsActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.detail_activity);

    }
}
