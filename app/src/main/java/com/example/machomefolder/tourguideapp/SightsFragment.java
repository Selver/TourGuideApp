package com.example.machomefolder.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SightsFragment extends Fragment {

    // Required empty public constructor
    public SightsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);


        final ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item(R.drawable.tivoli_gardens, R.string.tivoli_gardens, R.string.tivoli_gardens_address, R.string.tivoli_gardens_info));
        items.add(new Item(R.drawable.little_mermaid, R.string.little_mermaid, R.string.little_mermaid_address, R.string.little_mermaid_info));
        items.add(new Item(R.drawable.nyhavn, R.string.nyhavn, R.string.nyhavn_address, R.string.nyhavn_info));
        items.add(new Item(R.drawable.christiania, R.string.christiania, R.string.christiania_address, R.string.christiania_info));
        items.add(new Item(R.drawable.rosenborg_castle, R.string.rosenborg_castle, R.string.rosenborg_castle_address, R.string.rosenborg_castle_info));

        // Create an {@link ArrayAdapter}
        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        // Find the {@link ListView} object in the view hierarchy
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above
        listView.setAdapter(adapter);

        return rootView;
    }
}



