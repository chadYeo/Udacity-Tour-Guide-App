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
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_of_items, container, false);

        ArrayList<Item> items = new ArrayList<Item>();

        Location churrasqueiraBairradaRestaurant = new Location(getString(R.string.restaurant_churrasqueiraBairradaRestaurant_name));
        churrasqueiraBairradaRestaurant.setLatitude(40.750973);
        churrasqueiraBairradaRestaurant.setLongitude(-73.636506);

        items.add(new Item(getString(R.string.restaurant_churrasqueiraBairradaRestaurant_name),
                getString(R.string.restaurant_churrasqueiraBairradaRestaurant_description),
                getString(R.string.restaurant_churrasqueiraBairradaRestaurant_address),
                R.raw.churrasqueira_bairrada_restaurant,
                churrasqueiraBairradaRestaurant));

        Location sangria71 = new Location(getString(R.string.restaurant_sangria71_name));
        sangria71.setLatitude(40.757131);
        sangria71.setLongitude(-73.642027);

        items.add(new Item(getString(R.string.restaurant_sangria71_name),
                getString(R.string.restaurant_sangria71_description),
                getString(R.string.restaurant_sangria71_address),
                R.raw.sangria71,
                sangria71));

        Location vincentsClamBar = new Location(getString(R.string.restaurant_vincentsClamBar_name));
        vincentsClamBar.setLatitude(40.744500);
        vincentsClamBar.setLongitude(-73.614518);

        items.add(new Item(getString(R.string.restaurant_vincentsClamBar_name),
                getString(R.string.restaurant_vincentsClamBar_description),
                getString(R.string.restaurant_vincentsClamBar_address),
                R.raw.vincents_clam_bar,
                vincentsClamBar));

        Location plattdeutschePark = new Location(getString(R.string.restaurant_plattdeutschePark_name));
        plattdeutschePark.setLatitude(40.708555);
        plattdeutschePark.setLongitude(-73.682072);

        items.add(new Item(getString(R.string.restaurant_plattdeutschePark_name),
                getString(R.string.restaurant_plattdeutschePark_description),
                getString(R.string.restaurant_plattdeutschePark_address),
                R.raw.plattdeutsche_park,
                plattdeutschePark));

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        listView.setAdapter(adapter);

        return rootView;
    }

}
