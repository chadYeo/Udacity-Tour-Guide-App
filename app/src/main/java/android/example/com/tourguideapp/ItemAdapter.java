package android.example.com.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by chad.yeo on 1/19/2017.
 */
public class ItemAdapter extends ArrayAdapter<Item>{

    public ItemAdapter(Context context, List<Item> items) {
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.item, parent, false);
        }

        // Get the object located at this position in the list
        Item currentItem = getItem(position);

        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location_textView);
        locationTextView.setText(currentItem.getLocation());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description_textView);
        descriptionTextView.setText(currentItem.getDescription());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_textView);
        addressTextView.setText(currentItem.getAddress());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageView);
        imageView.setImageResource(currentItem.getImageResourceId());

        return listItemView;
    }
}
