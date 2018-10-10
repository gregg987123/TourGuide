package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of bar attractions.
 */
public class BarsFragment extends Fragment {

    public BarsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.bars_name_one, R.string.bars_address_one));
        attractions.add(new Attraction(R.string.bars_name_two, R.string.bars_address_two));
        attractions.add(new Attraction(R.string.bars_name_three, R.string.bars_address_three));
        attractions.add(new Attraction(R.string.bars_name_four, R.string.bars_address_four));
        attractions.add(new Attraction(R.string.bars_name_five, R.string.bars_address_five));
        attractions.add(new Attraction(R.string.bars_name_six, R.string.bars_address_six));
        attractions.add(new Attraction(R.string.bars_name_seven, R.string.bars_address_seven));
        attractions.add(new Attraction(R.string.bars_name_eight, R.string.bars_address_eight));
        attractions.add(new Attraction(R.string.bars_name_nine, R.string.bars_address_nine));
        attractions.add(new Attraction(R.string.bars_name_ten, R.string.bars_address_ten));
        attractions.add(new Attraction(R.string.bars_name_eleven, R.string.bars_address_eleven));
        attractions.add(new Attraction(R.string.bars_name_twelve, R.string.bars_address_twelve));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color
                .category_bars);

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
