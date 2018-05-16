package com.example.machomefolder.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class EateriesFragment extends Fragment {

    // Required empty public constructor
    public EateriesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item(R.drawable.breakfast_and_brunch, R.string.breakfast_and_brunch, R.string.breakfast_and_brunch_info));
        items.add(new Item(R.drawable.michelin_starred_restaurants, R.string.michelin_starred_restaurants, R.string.michelin_starred_restaurants_info));
        items.add(new Item(R.drawable.local_food, R.string.local_danish_food, R.string.local_danish_food_info));
        items.add(new Item(R.drawable.great_cheap_eats, R.string.great_cheap_eats, R.string.great_cheap_eats_info));

        // Create an {@link ArrayAdapter}
        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        // Find the {@link ListView} object in the view hierarchy
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above
        listView.setAdapter(adapter);

        return rootView;
    }
}