package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of restaurant attractions.
 */
public class RestaurantFragment extends Fragment {

    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        /*Creating an ArrayList of Attractions*/
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.restaurants_name_one, R.string.restaurants_address_one));
        attractions.add(new Attraction(R.string.restaurants_name_two, R.string.restaurants_address_two));
        attractions.add(new Attraction(R.string.restaurants_name_three, R.string.restaurants_address_three));
        attractions.add(new Attraction(R.string.restaurants_name_four, R.string.restaurants_address_four));
        attractions.add(new Attraction(R.string.restaurants_name_five, R.string.restaurants_address_five));
        attractions.add(new Attraction(R.string.restaurants_name_six, R.string.restaurants_address_six));
        attractions.add(new Attraction(R.string.restaurants_name_seven, R.string.restaurants_address_seven));
        attractions.add(new Attraction(R.string.restaurants_name_eight, R.string.restaurants_address_eight));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color
                .category_restaurants);

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
