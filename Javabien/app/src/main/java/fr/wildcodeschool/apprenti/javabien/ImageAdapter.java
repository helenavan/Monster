package fr.wildcodeschool.apprenti.javabien;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by apprenti on 21/09/16.
 */
public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    //constructeur
    public ImageAdapter(Context c) {
        mContext = c;
    }
    @Override
    public int getCount() {
        return mThumbIds.length;
    }
    @Override
    public Object getItem(int position) {
        return null;
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }
    @Override
    //créer une nouvelle ImageView pour chaque item référencé avec l'Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(mContext);
            // imageView.setMaxHeight(100);
            // imageView.setMaxWidth(100);
            //centrer et couper l'image
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setPadding(8, 8, 8, 8);
            imageView.setAdjustViewBounds(Boolean.TRUE);

        } else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }
    //Les images dans l'Array
    public Integer[] mThumbIds = {
            R.drawable.deer, R.drawable.deer,
            R.drawable.wild, R.drawable.wild,
            R.drawable.wild, R.drawable.wild
    };
}
