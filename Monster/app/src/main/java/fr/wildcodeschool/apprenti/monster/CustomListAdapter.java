package fr.wildcodeschool.apprenti.monster;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by apprenti on 09/09/16.
 */
public class CustomListAdapter extends ArrayAdapter<String> {


    private final Activity context;
    private final String[] itemname;
    private final Integer[] imageId;

    public CustomListAdapter(Activity context, String[] itemname, Integer[] imageId) {
        super(context, R.layout.mylist, itemname);
        this.context = context;
        this.itemname = itemname;
        this.imageId = imageId;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater= context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist, null, true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);

        txtTitle.setText(getItem(position));

        txtTitle.setText(itemname[position]);
        imageView.setImageResource(imageId[position]);
        return rowView;
    }

    }

