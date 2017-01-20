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
public class MansionsFragment extends Fragment {


    public MansionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_of_items, container, false);

        ArrayList<Item> items = new ArrayList<Item>();

        Location clarkBotanicGarden = new Location(getString(R.string.mansion_clarkBotanic_name));
        clarkBotanicGarden.setLatitude(40.772124);
        clarkBotanicGarden.setLongitude(-73.640853);

        items.add(new Item(getString(R.string.mansion_clarkBotanic_name),
                getString(R.string.mansion_clarkBotanic_description),
                getString(R.string.mansion_clarkBotanic_address),
                R.raw.clark_botanic_garden,
                clarkBotanicGarden));

        Location oldWestburyGardens = new Location(getString(R.string.mansion_oldWestbury_name));
        oldWestburyGardens.setLatitude(40.773184);
        oldWestburyGardens.setLongitude(-73.596776);

        items.add(new Item(getString(R.string.mansion_oldWestbury_name),
                getString(R.string.mansion_oldWestbury_description),
                getString(R.string.mansion_oldWestbury_address),
                R.raw.old_westbury_gardens,
                oldWestburyGardens));

        Location sagamoreHill = new Location(getString(R.string.mansion_sagamore_name));
        sagamoreHill.setLatitude(40.885529);
        sagamoreHill.setLongitude(-73.501030);

        items.add(new Item(getString(R.string.mansion_sagamore_name),
                getString(R.string.mansion_sagamore_description),
                getString(R.string.mansion_sagamore_address),
                R.raw.sagamore_hill,
                sagamoreHill));

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        listView.setAdapter(adapter);

        return rootView;
    }

}
