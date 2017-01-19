package android.example.com.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class BeachesFragment extends Fragment {

    public BeachesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_of_items, container, false);

        final ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item("Bar Beach", "Upper Long Island Beach", "Bar Beach, Port Washington, NY 11050", R.raw.bar_beach));
        items.add(new Item("Lido Beach", "Lido Beach is a hamlet and census-designated place in Nassau County, New York, United States.", "Lido Beach, NY", R.raw.lido_beach));
        items.add(new Item("Tobay Beach", "Tobay Beach is a restricted access recreational beach located in the middle of Jones Beach Island, a barrier island off the South Shore of Long Island, New York in Nassau County", "Tobay Beach, New York", R.raw.tobay_beach));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
