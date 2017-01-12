package com.jaime.fisheri;

import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.jaime.fisheri.fragments.CourseFragment;
import com.jaime.fisheri.fragments.HomeFragment;
import com.jaime.fisheri.fragments.ProfileFragment;

public class MainMenuActivity extends AppCompatActivity {
    private BottomNavigationView bnvNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
        HomeFragment home = new HomeFragment();
        ft.replace(R.id.activity_main_menu, home).commit();

        bnvNavigation = (BottomNavigationView) findViewById(R.id.bnv_navigation);
        bnvNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();

                switch (item.getItemId()) {
                    case R.id.action_home:
                        HomeFragment home = new HomeFragment();
                        ft.replace(R.id.activity_main_menu, home).commit();
                        break;

                    case R.id.action_course:
                        CourseFragment course = new CourseFragment();
                        ft.replace(R.id.activity_main_menu, course).commit();
                        break;

                    case R.id.action_settings:
                        ProfileFragment settings = new ProfileFragment();
                        ft.replace(R.id.activity_main_menu, settings).commit();
                        break;
                }

                return true;
            }
        });
    }
}
