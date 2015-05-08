package com.example.jayb.sunshine2;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main,container);
        String[] forecastArray = {
                "Today - Sunny",
                "Tommorow - Foggy",
                "Weds - Cloudy",
                "Thurs - Rainy",
                "Friday - Cloudy",
                "Sato - Foggy",
                "Sun - Sunny"
        };

        List<String> weekForecast = new ArrayList<String>(Arrays.asList(forecastArray));

        ArrayAdapter<String> mforecastAdapter = new ArrayAdapter<String>(getActivity(),R.layout.list_item_forecast,
                R.id.list_item_forecast_textView,weekForecast);

        ListView listView = (ListView)rootView.findViewById(R.id.list_view_forecast);
        listView.setAdapter(mforecastAdapter);

        return rootView;
    }
}
