package com.example.machomefolder.tourguideapp;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class MuseumsFragment extends Fragment {

    // Required empty public constructor
    public MuseumsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Item(R.drawable.national_museum, R.string.national_museum, R.string.national_museum_address, R.string.national_museum_info));
        items.add(new Item(R.drawable.louisiana_museum, R.string.louisiana_museum, R.string.louisiana_museum_address, R.string.louisiana_museum_info));
        items.add(new Item(R.drawable.design_museum, R.string.design_museum, R.string.design_museum_address, R.string.design_museum_info));
        items.add(new Item(R.drawable.workers_museum, R.string.workers_museum, R.string.workers_museum_address, R.string.workers_museum_info));

        // Create an {@link ArrayAdapter}
        ItemAdapter adapter = new ItemAdapter(getActivity(), items);

        // Find the {@link ListView} object in the view hierarchy
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above
        listView.setAdapter(adapter);

        return rootView;

    }
}



