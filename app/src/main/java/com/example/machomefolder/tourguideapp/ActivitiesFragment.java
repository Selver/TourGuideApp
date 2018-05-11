package com.example.machomefolder.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class ActivitiesFragment extends Fragment {

    // Required empty public constructor
    public ActivitiesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);


        final ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item(R.drawable.rent_a_bike, "Rent A Bike", R.string.rent_a_bike_info));
        items.add(new Item(R.drawable.events, "Events", R.string.events_info));
        items.add(new Item(R.drawable.flea_market, "Flea Market", R.string.flea_market_info));
        items.add(new Item(R.drawable.walking_tour, "Walking Tour ", R.string.walking_tour_info));
        items.add(new Item(R.drawable.boat_tour, "Boat Tour", R.string.boat_tour_info));

        // Create an {@link ArrayAdapter}
        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        // Find the {@link ListView} object in the view hierarchy.
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above
        listView.setAdapter(adapter);

        return rootView;
    }
}