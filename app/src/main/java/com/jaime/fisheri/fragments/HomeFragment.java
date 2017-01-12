package com.jaime.fisheri.fragments;


import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;

import com.jaime.fisheri.R;
import com.jaime.fisheri.adapters.HomeworkAdapter;


public class HomeFragment extends Fragment {
    private RecyclerView mRecycler;
    private HomeworkAdapter mAdapter;

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
        }

        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mRecycler.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        mRecycler.setHasFixedSize(true);
        mRecycler.setAdapter(mAdapter);
    }
}
