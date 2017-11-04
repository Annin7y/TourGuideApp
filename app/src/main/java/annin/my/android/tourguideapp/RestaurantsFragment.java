package annin.my.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Attraction> words = new ArrayList<>();

        words.add(new Attraction(getString(R.string.name_la_fenice), getString(R.string.description_la_fenice), getString(R.string.address_la_fenice), getString(R.string.email_la_fenice), R.drawable.restaurant_lafenice));
        words.add(new Attraction(getString(R.string.name_george), getString(R.string.description_george), getString(R.string.address_george), getString(R.string.email_george), R.drawable.restaurant_george));
        words.add(new Attraction(getString(R.string.name_alo), getString(R.string.description_alo), getString(R.string.address_alo), getString(R.string.email_alo), R.drawable.restaurant_alo));
        words.add(new Attraction(getString(R.string.name_blu), getString(R.string.description_blu), getString(R.string.address_blu), getString(R.string.email_blu), R.drawable.restaurant_blu));
        words.add(new Attraction(getString(R.string.name_edulis), getString(R.string.description_edulis), getString(R.string.address_edulis), getString(R.string.email_edulis), R.drawable.restaurant_edulis));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), words, R.color.category_restaurants);


        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}