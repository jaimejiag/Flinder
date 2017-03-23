package com.jaime.flinder.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.jaime.flinder.POJO.Subject;
import com.jaime.flinder.R;
import com.jaime.flinder.repositories.SubjectsRepository;


/**
 * Created by usuario on 23/03/17.
 */

public class SubjectAdapter extends ArrayAdapter<Subject> {
    private Context context;


    public SubjectAdapter(Context context) {
        super(context, R.layout.subject_item, SubjectsRepository.getInstance());
        this.context = context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        SubjectHolder holder;

        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(R.layout.subject_item, null);
            holder = new SubjectHolder();

            holder.txvSubject = (TextView) view.findViewById(R.id.txv_subject);

            view.setTag(holder);
        } else
            holder = (SubjectHolder) view.getTag();

        holder.txvSubject.setText(getItem(position).getName());

        return view;
    }


    private class SubjectHolder {
        private TextView txvSubject;
    }
}
