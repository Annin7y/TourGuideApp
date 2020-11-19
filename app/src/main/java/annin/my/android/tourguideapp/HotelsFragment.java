/**
 *  Created by Anastasia Annin on 11/2/2016.
 *  A Udacity Basics Nanodegree Project
 *  Copyright 2020 Anastasia Annin
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  * http://www.apache.org/licenses/LICENSE-2.0
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package annin.my.android.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class HotelsFragment extends Fragment
{
    public HotelsFragment()
    {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        ArrayList<Attraction> words = new ArrayList<>();

        words.add(new Attraction(getString(R.string.name_royal_york), getString(R.string.description_royal_york), getString(R.string.address_royal_york),getString(R.string.email_royal_york), R.drawable.hotel_royalyork));
        words.add(new Attraction(getString(R.string.name_shangrila), getString(R.string.description_shangrila), getString(R.string.address_shangrila), getString(R.string.email_shangrila), R.drawable.hotel_shangrila));
        words.add(new Attraction(getString(R.string.name_four_seasons), getString(R.string.description_four_seasons), getString(R.string.address_four_seasons), getString(R.string.email_four_seasons), R.drawable.hotel_fourseasons));
        words.add(new Attraction(getString(R.string.name_king_edward), getString(R.string.description_king_edward), getString(R.string.address_king_edward), getString(R.string.email_king_edward), R.drawable.hotel_kingedward));
        words.add(new Attraction(getString(R.string.name_ritz), getString(R.string.description_ritz), getString(R.string.address_ritz), getString(R.string.email_ritz), R.drawable.hotel_ritz));

        AttractionAdapter adapter = new AttractionAdapter(getActivity(), words, R.color.category_hotels);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}


