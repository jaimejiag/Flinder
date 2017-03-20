package com.jaime.flinder;

import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.app.FragmentTransaction;

import com.jaime.flinder.fragments.CourseFragment;
import com.jaime.flinder.fragments.HomeFragment;
import com.jaime.flinder.fragments.ProfileFragment;

public class MenuActivity extends AppCompatActivity {
    private BottomNavigationView bnvNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);



        FragmentTransaction ft = getFragmentManager().beginTransaction();
        HomeFragment home = new HomeFragment();
        ft.replace(R.id.activity_main_menu, home).commit();

        bnvNavigation = (BottomNavigationView) findViewById(R.id.bnv_navigation);
        bnvNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();

                switch (item.getItemId()) {
                    case R.id.action_home:
                        HomeFragment home = new HomeFragment();
                        ft.addToBackStack(null);
                        ft.replace(R.id.activity_main_menu, home).commit();
                        break;

                    case R.id.action_course:
                        CourseFragment course = new CourseFragment();
                        ft.addToBackStack(null);
                        ft.replace(R.id.activity_main_menu, course).commit();
                        break;

                    case R.id.action_settings:
                        ProfileFragment settings = new ProfileFragment();
                        ft.addToBackStack(null);
                        ft.replace(R.id.activity_main_menu, settings).commit();
                        break;
                }

                return true;
            }
        });
    }
}
