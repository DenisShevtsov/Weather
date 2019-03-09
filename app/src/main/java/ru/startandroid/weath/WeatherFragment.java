package ru.startandroid.weath;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;


/**
 * A simple {@link Fragment} subclass.
 */
public class WeatherFragment extends Fragment {


    public WeatherFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_weather, container, false);

        TextView town = view.findViewById(R.id.town);
        TextView info = view.findViewById(R.id.temp);

        town.setText(getArguments().getString("tname"));
        info.setText(getArguments().getInt("temp") + " " + getArguments().getString("status"));
        // Inflate the layout for this fragment
        return view;
    }

}
