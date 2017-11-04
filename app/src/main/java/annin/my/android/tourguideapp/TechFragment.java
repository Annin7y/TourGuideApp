package annin.my.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class TechFragment extends Fragment {

    public TechFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        ArrayList<Attraction> words = new ArrayList<>();

        words.add(new Attraction(getString(R.string.name_osellus), getString(R.string.description_osellus), getString(R.string.address_oselus), getString(R.string.email_osellus)));
        words.add(new Attraction(getString(R.string.name_devfusion), getString(R.string.description_devfusion), getString(R.string.address_devfusion), getString(R.string.email_devfusion)));
        words.add(new Attraction(getString(R.string.name_working_group), getString(R.string.description_working_group), getString(R.string.address_working_group), getString(R.string.email_working_group)));
        words.add(new Attraction(getString(R.string.name_firestitch), getString(R.string.description_firestitch), getString(R.string.address_firestitch), getString(R.string.email_firestitch)));
        words.add(new Attraction(getString(R.string.name_plastic_mobile), getString(R.string.description_plastic_mobile), getString(R.string.address_plastic_mobile), getString(R.string.email_plastic_mobile)));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), words, R.color.category_tech);


        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}