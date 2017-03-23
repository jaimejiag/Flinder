package com.jaime.flinder.utils;

import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.utils.ViewPortHandler;

/**
 * Created by usuario on 23/03/17.
 */

public class PieChartFormat implements IValueFormatter {

    @Override
    public String getFormattedValue(float value, Entry entry, int dataSetIndex, ViewPortHandler viewPortHandler) {
        String result = "";

        if (value == 1)
            result = (int) value + " tarea";
        else
            result = (int) value + " tareas";

        return result;
    }
}
