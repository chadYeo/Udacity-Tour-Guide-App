package android.example.com.tourguideapp;


import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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

        Location barBeach = new Location(getString(R.string.bar_beach_name));
        barBeach.setLatitude(40.828681);
        barBeach.setLongitude(-73.654318);

        items.add(new Item(getString(R.string.bar_beach_name),
                getString(R.string.bar_beach_description),
                getString(R.string.bar_beach_address),
                R.drawable.bar_beach,
                barBeach));

        Location lidoBeach = new Location(getString(R.string.lido_beach_name));
        lidoBeach.setLatitude(40.588993);
        lidoBeach.setLongitude(-73.625407);

        items.add(new Item(getString(R.string.lido_beach_name),
                getString(R.string.lido_beach_description),
                getString(R.string.lido_beach_address),
                R.drawable.lido_beach,
                lidoBeach));

        Location tobayBeach = new Location(getString(R.string.tobay_beach_name));
        tobayBeach.setLatitude(40.611575);
        tobayBeach.setLongitude(-73.432013);

        items.add(new Item(getString(R.string.tobay_beach_name),
                getString(R.string.tobay_beach_description),
                getString(R.string.tobay_beach_address),
                R.drawable.tobay_beach,
                tobayBeach));


        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                double latitude = items.get(position).getLocation().getLatitude();
                double longitude = items.get(position).getLocation().getLongitude();
                String keyword = items.get(position).getAddress();

                String data = String.format("geo:%s,%s ?q=%s", latitude, longitude, keyword);
                Uri geoLocation = Uri.parse(data);

                showMap(geoLocation);
            }
        });
        return rootView;
    }

    public void showMap(Uri geoLocation) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(geoLocation);
        if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
