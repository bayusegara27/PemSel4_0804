package com.bayusegara.praktikum4;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class SimpleFragment extends Fragment {

    private Button btnNextFragment;

    public SimpleFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_simple, container, false);

        // Initialize button
        btnNextFragment = view.findViewById(R.id.btn_next_fragment);

        // Set click listener for button in fragment
        btnNextFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show alert dialog
                new AlertDialog.Builder(getActivity())
                        .setTitle("Message")
                        .setMessage("This button click is handled by SimpleFragment")
                        .setPositiveButton("OK", null)
                        .show();
            }
        });

        return view;
    }
}
