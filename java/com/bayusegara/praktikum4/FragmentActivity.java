package com.bayusegara.praktikum4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FragmentActivity extends AppCompatActivity {

    private Button btnLoadFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        // Initialize button
        btnLoadFragment = findViewById(R.id.btn_load_fragment);

        // Set click listener for load fragment button
        btnLoadFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new fragment instance
                SimpleFragment simpleFragment = new SimpleFragment();

                // Begin a fragment transaction
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                // Replace whatever is in the fragment_container with this fragment
                transaction.replace(R.id.fragment_container, simpleFragment);

                // Add the transaction to the back stack so the user can navigate back
                transaction.addToBackStack(null);

                // Commit the transaction
                transaction.commit();
            }
        });
    }
}
