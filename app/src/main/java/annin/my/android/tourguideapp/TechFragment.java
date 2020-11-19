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

public class TechFragment extends Fragment
{
    public TechFragment()
    {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
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