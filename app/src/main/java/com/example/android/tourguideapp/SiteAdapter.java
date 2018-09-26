package com.example.android.tourguideapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class SiteAdapter extends ArrayAdapter<Site> {
    public SiteAdapter(Activity context, ArrayList<Site> sites) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, sites);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.listfile, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Site currentSite = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView descriptionView = (TextView) listItemView.findViewById(R.id.description);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        descriptionView.setText(currentSite.getDescription());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView contactView = (TextView) listItemView.findViewById(R.id.contact);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        contactView.setText(currentSite.getContact());

        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        image.setImageResource(currentSite.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }

}

