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
public class MansionsFragment extends Fragment {


    public MansionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_of_items, container, false);

        ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item("Clark Botanic Garden", "The Clark Botanic Garden is a botanical garden located on Long Island", "193 I. U. Willets Rd, Albertson, New York", R.raw.clark_botanic_garden));
        items.add(new Item("Old Westbury Gardens", "200-acre property offers a historic mansion amid formal botanical gardens, with daily guided tours.", "71 Old Westbury Rd, Westbury, NY 11590", R.raw.old_westbury_gardens));
        items.add(new Item("Sagamore Hill", "Former home of Theodore Roosevelt with museum, nature trails, beach & visitor center on 83 acres.", "20 Sagamore Hill Rd, Oyster Bay, NY 11771", R.raw.sagamore_hill));

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        listView.setAdapter(adapter);

        return rootView;
    }

}
