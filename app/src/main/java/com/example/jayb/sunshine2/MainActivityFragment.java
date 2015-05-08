package com.example.jayb.sunshine2;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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

        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
