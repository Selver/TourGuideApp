package com.example.machomefolder.tourguideapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends ArrayAdapter<Item> {

    private Context activityContext;


    public ItemAdapter(Context context, ArrayList pItems) {
        super(context, 0, pItems);

        activityContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        final Item my_item = (Item) getItem(position);

        ImageView itemImageView = (ImageView) listItemView.findViewById(R.id.item_image_view);
        itemImageView.setImageResource(my_item.getImageResourceId());

        TextView itemNameTextView = (TextView) listItemView.findViewById(R.id.item_name_text_view);
        itemNameTextView.setText(my_item.getName());

        TextView itemAddressTextView = (TextView) listItemView.findViewById(R.id.item_address_text_view);

        if (my_item.hasAddress()) {

            itemAddressTextView.setText(my_item.getAddress());

            //Make sure address view is set visible
            itemAddressTextView.setVisibility(View.VISIBLE);

        } else {
            itemAddressTextView.setVisibility(View.GONE);
        }

        //Opening the details activity upon clicking anywhere in the list item.
        LinearLayout itemsLayout = listItemView.findViewById(R.id.tourist_guide_items);
        itemsLayout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent itemInfoIntent = new Intent(activityContext, ItemDetails.class);
                itemInfoIntent.putExtra(ItemDetails.EXTRA_INFO, my_item);
                activityContext.startActivity(itemInfoIntent);
            }
        });

        return listItemView;
    }
}