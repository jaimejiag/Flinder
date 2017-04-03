package com.jaime.flinder;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.jaime.flinder.adapters.ViewPagerAdapter;
import com.jaime.flinder.fragments.courseTabs.StatiticsFragment;
import com.jaime.flinder.fragments.courseTabs.SubjectsFragment;

/**
 * Created by usuario on 3/04/17.
 */

public class CourseFragmentActivity extends FragmentActivity {
    private TabLayout tlCourse;
    private ViewPager vpCourse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_course);

        vpCourse = (ViewPager) findViewById(R.id.vp_course);
        setupViewPager();


        tlCourse = (TabLayout) findViewById(R.id.tl_course);
        tlCourse.setupWithViewPager(vpCourse);
    }


    private void setupViewPager() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new SubjectsFragment(), getResources().getString(R.string.subject_profile));
        adapter.addFragment(new StatiticsFragment(), getResources().getString(R.string.statistics_course));
        vpCourse.setAdapter(adapter);
    }
}
