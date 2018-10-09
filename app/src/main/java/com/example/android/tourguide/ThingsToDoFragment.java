package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of things-to-do attractions.
 */
public class ThingsToDoFragment extends Fragment {

    public ThingsToDoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        /*Creating an ArrayList of Attractions*/
        //Images are NOT my own and not licensed. These are only be used for educational purposes.
        // mke_art_museum from bluffton.edu; harley_davidson_museum from visitmilwaukee.org
        // fiserv_forum from gannett-cdn.com; milwaukee_county_zoo from onmilwaukee.com
        // miller_park from stadiumjourney.com; henry_maier_festival_park from statetrunktour.com
        // discovery_world from discoveryworld.org
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.things_name_one, R.string.things_address_one, R.drawable.mke_art_museum));
        attractions.add(new Attraction(R.string.things_name_two, R.string.things_address_two, R
                .drawable.harley_davidson_museum));
        attractions.add(new Attraction(R.string.things_name_three, R.string.things_address_three,
                R.drawable.milwaukee_county_zoo));
        attractions.add(new Attraction(R.string.things_name_four, R.string.things_address_four, R
                .drawable.discovery_world));
        attractions.add(new Attraction(R.string.things_name_five, R.string.things_address_five, R
                .drawable.miller_park));
        attractions.add(new Attraction(R.string.things_name_six, R.string.things_address_six, R
                .drawable.fiserv_forum));
        attractions.add(new Attraction(R.string.things_name_seven, R.string.things_address_seven,
                R.drawable.henry_maier_festival_park));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color
                .category_things);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
