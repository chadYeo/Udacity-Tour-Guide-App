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
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_of_items, container, false);

        ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item("Bethpage State Park", "Large park featuring 5 golf courses, hiking & biking trails & picnic facilities.", "99 Quaker Meeting House Rd, Farmingdale, NY 11735", R.raw.bethpage_state_park));
        items.add(new Item("Hempstead Lake State Park", "Tranquil park with playgrounds, equestrian, biking & hiking trails & an old-school wooden carousel", "Eagle Ave, West Hempstead, NY 11552", R.raw.hempstead_lake_state_park));
        items.add(new Item("Theodore Roosevelt Memorial Park", "Bayside park with athletic fields & courts, playgrounds, boat ramps & a beach on Oyster Bay Harbor.", "West End Ave, Oyster Bay, NY 11771", R.raw.theodore_roosevelt_memorial_park));
        items.add(new Item("Wantagh Park", "Large green space featuring athletic fields, playgrounds, a fishing pier & an outdoor pool.", "1 King Rd, Wantagh, NY 11793", R.raw.wantagh_park));

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        listView.setAdapter(adapter);

        return rootView;
    }

}
