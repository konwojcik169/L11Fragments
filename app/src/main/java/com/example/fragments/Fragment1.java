package com.example.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends ListFragment {
    ArrayList<String> cities = new ArrayList<>();
    ArrayAdapter<String> adapter;

    public Fragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment1, viewGroup, false);

        adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, cities);
        setListAdapter(adapter);
        return view;
    }

    public void onListItemClick(ListView listView, View view, int position, long id ) {
        MainActivity.itemSelected = position;
        MainActivity.isSelected = true;
        getListView().setSelector(android.R.color.holo_blue_dark);
    }

}
