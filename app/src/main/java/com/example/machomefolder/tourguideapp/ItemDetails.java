package com.example.machomefolder.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemDetails extends AppCompatActivity {

    public static final String EXTRA_INFO = "info";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_details);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Item info = getIntent().getExtras().getParcelable(EXTRA_INFO);
            ImageView mainPhoto = (ImageView) findViewById(R.id.item_details_image_view);
            mainPhoto.setImageResource(info.getImageResourceId());

            TextView name = (TextView) findViewById(R.id.item_name_text_view);
            name.setText(info.getName());

            if (info.hasAddress()) {
                TextView address = (TextView) findViewById(R.id.item_address_text_view);
                address.setText(info.getAddress());

                //Make sure address view is set visible
                address.setVisibility(View.VISIBLE);

            } else {
                TextView address = (TextView) findViewById(R.id.item_address_text_view);
                address.setVisibility(View.GONE);
            }

            TextView itemInfo = (TextView) findViewById(R.id.item_info);
            itemInfo.setText(info.getInfo());

        }
    }
}
