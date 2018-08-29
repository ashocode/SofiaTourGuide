package com.example.android.sofiatourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationCustomAdapter extends ArrayAdapter<LocationData> implements View.OnClickListener {

    LocationCustomAdapter(Context context, int resource, ArrayList<LocationData> data) {
        super(context, resource, data);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        if (view == null) {
            LayoutInflater inflater;
            inflater = LayoutInflater.from(getContext());
            view = inflater.inflate(R.layout.location_item, null);
        }

        LocationData itemPosition = getItem(position);

        if (itemPosition != null) {
            TextView locationNameView = (TextView) view.findViewById(R.id.location_name);
            TextView locationDescriptionView = (TextView) view.findViewById(R.id.location_description);
            ImageView locationImage = (ImageView) view.findViewById(R.id.location_image);

            if (locationNameView != null) {
                locationNameView.setText(itemPosition.getLocationName());
            }

            if (locationDescriptionView != null) {
                locationDescriptionView.setText(itemPosition.getLocationDescription());
            }

            if (locationImage != null) {
                locationImage.setImageResource(itemPosition.getLocationImage());
            }
        }

        return view;
    }

    @Override
    public void onClick(View view) {}
}
