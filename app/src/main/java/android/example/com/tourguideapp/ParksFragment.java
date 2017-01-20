package android.example.com.tourguideapp;


import android.location.Location;
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

        Location bethpageStatePark = new Location(getString(R.string.park_bethpage_name));
        bethpageStatePark.setLatitude(40.745672);
        bethpageStatePark.setLongitude(-73.456324);

        items.add(new Item(getString(R.string.park_bethpage_name),
                getString(R.string.park_bethpage_description),
                getString(R.string.park_bethpage_address),
                R.raw.bethpage_state_park,
                bethpageStatePark));

        Location hempsteadLakeStatePark = new Location(getString(R.string.park_hempsteadLake_name));
        hempsteadLakeStatePark.setLatitude(40.683058);
        hempsteadLakeStatePark.setLongitude(-73.643106);

        items.add(new Item(getString(R.string.park_hempsteadLake_name),
                getString(R.string.park_hempsteadLake_description),
                getString(R.string.park_hempsteadLake_address),
                R.raw.hempstead_lake_state_park,
                hempsteadLakeStatePark));

        Location theodoreRooseveltMemorialpark = new Location(getString(R.string.park_theodoreRoosevelt_name));
        theodoreRooseveltMemorialpark.setLatitude(40.875818);
        theodoreRooseveltMemorialpark.setLongitude(-73.537075);

        items.add(new Item(getString(R.string.park_theodoreRoosevelt_name),
                getString(R.string.park_theodoreRoosevelt_description),
                getString(R.string.park_theodoreRoosevelt_address),
                R.raw.theodore_roosevelt_memorial_park,
                theodoreRooseveltMemorialpark));

        Location wantaghPark = new Location(getString(R.string.park_wantagh_name));
        wantaghPark.setLatitude(40.648297);
        wantaghPark.setLongitude(-73.511324);

        items.add(new Item(getString(R.string.park_wantagh_name),
                getString(R.string.park_wantagh_description),
                getString(R.string.park_wantagh_address),
                R.raw.wantagh_park,
                wantaghPark));

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        listView.setAdapter(adapter);

        return rootView;
    }

}
