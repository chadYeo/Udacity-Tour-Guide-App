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
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_of_items, container, false);

        ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item("Churrasqueira Bairrada Restaurant", "Portuguese rodizio offering sizzling grilled-meat skewers & other traditional fare.", "44 Jericho Turnpike, Mineola, NY 11501", R.raw.churrasqueira_bairrada_restaurant));
        items.add(new Item("Sangria 71", "Sophisticated restaurant offering refined Spanish dishes, including paella, along with sangria.", "71 Hillside Avenue, Williston Park, NY 11596", R.raw.sangria71));
        items.add(new Item("Vincent's Clam Bar", "A Manhattan Little Italy transplant & bustling old-school spot for fresh seafood & red-sauce pasta.", "179 Old Country Rd, Carle Place, NY 11514", R.raw.vincents_clam_bar));
        items.add(new Item("Plattdeutsche Park", "Authentic German cuisine, live music & festivals draw crowds to this historic eatery & beer garden.", "1132 Hempstead Turnpike, Franklin Square, NY 11010", R.raw.plattdeutsche_park));

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        listView.setAdapter(adapter);

        return rootView;
    }

}
