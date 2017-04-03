package com.jaime.flinder.fragments;


import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;


import com.jaime.flinder.MenuActivity;
import com.jaime.flinder.R;
import com.jaime.flinder.adapters.ViewPagerAdapter;
import com.jaime.flinder.fragments.courseTabs.StatiticsFragment;
import com.jaime.flinder.fragments.courseTabs.SubjectsFragment;


public class CourseFragment extends Fragment {
    private TabLayout tlCourse;
    private ViewPager vpCourse;

    private MenuActivity mContext;


    public CourseFragment() {

    }


    @Override
    public void onAttach(Activity activity) {
        mContext = (MenuActivity) activity;

        super.onAttach(activity);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.view_course, container, false);
        setRetainInstance(true);

        vpCourse = (ViewPager) rootView.findViewById(R.id.vp_course);
        setupViewPager();


        tlCourse = (TabLayout) rootView.findViewById(R.id.tl_course);
        tlCourse.setupWithViewPager(vpCourse);

        return rootView;
    }


    private void setupViewPager() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(mContext.getSupportFragmentManager());
        adapter.addFragment(new SubjectsFragment(), getResources().getString(R.string.subject_profile));
        adapter.addFragment(new StatiticsFragment(), getResources().getString(R.string.statistics_course));
        vpCourse.setAdapter(adapter);
    }
}
