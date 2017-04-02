package com.jaime.flinder.fragments.courseTabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.jaime.flinder.R;
import com.jaime.flinder.adapters.SubjectAdapter;


public class SubjectsFragment extends Fragment {
    private ListView lvSubjects;
    private SubjectAdapter mAdapter;


    public SubjectsFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_subjects, container, false);
        setRetainInstance(true);

        lvSubjects = (ListView) rootView.findViewById(R.id.lv_subjects);

        return rootView;
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mAdapter = new SubjectAdapter(getActivity());
        lvSubjects.setAdapter(mAdapter);
    }
}
