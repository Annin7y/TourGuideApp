package annin.my.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        ArrayList<Attraction> words = new ArrayList<>();

        words.add(new Attraction(getString(R.string.name_rom), getString(R.string.description_rom), getString(R.string.address_rom), getString(R.string.email_rom),R.drawable.museum_rom));
        words.add(new Attraction(getString(R.string.name_hockey), getString(R.string.description_hockey), getString(R.string.address_hockey), getString(R.string.email_hockey),R.drawable.museum_hockey));
        words.add(new Attraction(getString(R.string.name_ago), getString(R.string.description_ago), getString(R.string.address_ago), getString(R.string.email_ago),R.drawable.museum_ago));
        words.add(new Attraction(getString(R.string.name_bata), getString(R.string.description_bata), getString(R.string.address_bata), getString(R.string.email_bata),R.drawable.museum_bata));
        words.add(new Attraction(getString(R.string.name_aga), getString(R.string.description_aga), getString(R.string.address_aga), getString(R.string.email_aga),R.drawable.museum_agakhan));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(),words, R.color.category_museums);

        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);

        return rootView;
    }
}
