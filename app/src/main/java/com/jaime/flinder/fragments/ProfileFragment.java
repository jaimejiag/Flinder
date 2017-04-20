package com.jaime.flinder.fragments;


import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.Button;


import com.jaime.flinder.R;


public class ProfileFragment extends Fragment {
    private Button btnAbout;
    private Button btnLogout;

    private AboutFragment mFragment;
    private FragmentTransaction mTransaction;


    public ProfileFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mFragment = new AboutFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);
        setRetainInstance(true);

        if (rootView != null) {
            btnAbout = (Button) rootView.findViewById(R.id.btn_about);
            btnLogout = (Button) rootView.findViewById(R.id.btn_logout);
        }
        return rootView;
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTransaction = getFragmentManager().beginTransaction();
                mTransaction.addToBackStack(null);
                mTransaction.replace(R.id.activity_main_menu, mFragment).commit();
            }
        });
    }
}
