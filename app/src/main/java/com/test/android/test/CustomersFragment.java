package com.test.android.test;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import static com.test.android.test.R.layout.customer_layout;

/**
 * Created by danie on 9/21/2017.
 */

public class CustomersFragment extends Fragment {
    View myView;
    ImageButton imageButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(customer_layout, container, false);



      /* imageButton = (ImageButton) myView.findViewById(R.id.addCustomerButton);
       ImageButton.OnClickListener(new View.OnClickListener() {

           @Override
           public void onClick(View v) {

                Intent myIntent = new Intent(myView.getContext(), CustomersInfoFragment.class);
                startActivity(myIntent);
            }

        });*/

        return myView;
    }
}
