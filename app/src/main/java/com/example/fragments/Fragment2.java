package com.example.fragments;


import android.os.Bundle;
import android.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends DialogFragment {
    EditText et;

    public Fragment2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment2, viewGroup);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        et = view.findViewById(R.id.editText);
        Button b = view.findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String country = et.getText().toString();
                Fragment1 fr1 = (Fragment1)
                        getFragmentManager().findFragmentById(R.id.list);
                if (!country.equals("")) {
                    fr1.cities.add(country);
                    fr1.adapter.notifyDataSetChanged();
                }
                getActivity().getFragmentManager().beginTransaction()
                        .remove(Fragment2.this).commit();
            }
        });
    }
}
