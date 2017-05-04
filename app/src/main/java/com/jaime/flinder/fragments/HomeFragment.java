package com.jaime.flinder.fragments;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

import com.jaime.flinder.R;
import com.jaime.flinder.adapters.HomeworkAdapter;


public class HomeFragment extends Fragment {
    private RecyclerView mRecycler;
    private HomeworkAdapter mAdapter;
    private Toolbar mToolbar;

    public HomeFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mAdapter = new HomeworkAdapter(getActivity().getApplicationContext());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        setRetainInstance(true);

        if (rootView != null) {
            mRecycler = (RecyclerView) rootView.findViewById(R.id.rv_cardsList);
            mToolbar = (Toolbar) rootView.findViewById(R.id.toolbar_home);
        }

        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mRecycler.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        mRecycler.setHasFixedSize(true);
        mRecycler.setAdapter(mAdapter);

        final AppCompatActivity activity = (AppCompatActivity) getActivity();
        activity.setSupportActionBar(mToolbar);

        if (activity.getSupportActionBar() != null) {
            activity.setTitle(R.string.app_name);
        }
    }
}
