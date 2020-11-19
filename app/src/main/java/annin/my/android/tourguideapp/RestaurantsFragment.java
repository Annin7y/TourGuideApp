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

public class RestaurantsFragment extends Fragment
{
    public RestaurantsFragment()
    {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
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