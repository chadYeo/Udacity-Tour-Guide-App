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

    static class ViewHolder {
        TextView locatioinTextView;
        TextView descriptionTextView;
        TextView addressTextView;
        ImageView imageView;
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

        ViewHolder holder = new ViewHolder();

        holder.locatioinTextView = (TextView) listItemView.findViewById(R.id.location_textView);
        holder.locatioinTextView.setText(currentItem.getAttraction());
        holder.descriptionTextView = (TextView) listItemView.findViewById(R.id.description_textView);
        holder.descriptionTextView.setText(currentItem.getDescription());
        holder.addressTextView = (TextView) listItemView.findViewById(R.id.address_textView);
        holder.addressTextView.setText(currentItem.getAddress());
        holder.imageView = (ImageView) listItemView.findViewById(R.id.imageView);
        holder.imageView.setImageResource(currentItem.getImageResourceId());

        return listItemView;
    }
}
