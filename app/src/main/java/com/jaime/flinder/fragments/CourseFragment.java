package com.jaime.flinder.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;


import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.jaime.flinder.R;

import java.util.ArrayList;
import java.util.List;


public class CourseFragment extends Fragment {
    private PieChart pcGraph;

    private List<PieEntry> mEntries;


    public CourseFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_course, container, false);
        setRetainInstance(true);

        pcGraph = (PieChart) rootView.findViewById(R.id.pc_subjects_graph);

        return rootView;
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mEntries = new ArrayList<>();
        mEntries.add(new PieEntry(2, "Matemáticas"));
        mEntries.add(new PieEntry(1, "Física"));
        mEntries.add(new PieEntry(5, "Programación"));

        PieDataSet set = new PieDataSet(mEntries, "Asignaturas");
        set.setColors(new int[] { R.color.blue, R.color.green, R.color.red}, getActivity());
        PieData data = new PieData(set);
        pcGraph.setData(data);
        pcGraph.setDescription(null);
        pcGraph.setUsePercentValues(true);
        pcGraph.getLegend().setOrientation(Legend.LegendOrientation.VERTICAL);
        pcGraph.getLegend().setHorizontalAlignment(Legend.LegendHorizontalAlignment.RIGHT);
        pcGraph.getLegend().setVerticalAlignment(Legend.LegendVerticalAlignment.CENTER);
        pcGraph.invalidate();
    }
}
