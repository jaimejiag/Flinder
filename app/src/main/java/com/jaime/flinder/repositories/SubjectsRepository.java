package com.jaime.flinder.repositories;

import android.content.Context;

import com.jaime.flinder.POJO.Subject;
import com.jaime.flinder.R;

import java.util.ArrayList;

/**
 * Created by usuario on 23/03/17.
 */

public class SubjectsRepository extends ArrayList<Subject> {
    private static SubjectsRepository instance;


    public static SubjectsRepository getInstance() {
        if (instance == null)
            instance = new SubjectsRepository();

        return instance;
    }


    private SubjectsRepository() {
        add(new Subject("Mátemáticas", R.color.blue));
        add(new Subject("Física", R.color.green));
        add(new Subject("Programación", R.color.red));
        add(new Subject("Base de datos", android.R.color.holo_orange_dark));
    }
}
