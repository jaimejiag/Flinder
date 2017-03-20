package com.jaime.flinder.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.jaime.flinder.POJO.Homework;
import com.jaime.flinder.R;
import com.jaime.flinder.repositories.HomeworkRepository;

import java.util.ArrayList;

/**
 * Created by jaime on 05/01/2017.
 */

public class HomeworkAdapter extends RecyclerView.Adapter<HomeworkAdapter.HomeworkHolder> {
    private ArrayList<Homework> homeworks;
    private Context context;

    public HomeworkAdapter(Context context) {
        this.homeworks = new ArrayList<>(HomeworkRepository.getInstance());
        this.context = context;
    }

    @Override
    public HomeworkHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.homework_card, null);
        return new HomeworkHolder(view);
    }

    @Override
    public void onBindViewHolder(HomeworkHolder holder, int position) {
        holder.txvSubject.setText(homeworks.get(position).getSubject().getName());
        holder.txvDate.setText(homeworks.get(position).getDeadlineDate());
        holder.txvDescription.setText(homeworks.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return homeworks.size();
    }

    class HomeworkHolder extends RecyclerView.ViewHolder {
        public TextView txvSubject;
        public TextView txvDate;
        public TextView txvDescription;
        public Button btnShowCalendar;

        public HomeworkHolder(View itemView) {
            super(itemView);

            txvSubject = (TextView) itemView.findViewById(R.id.txv_subject_card);
            txvDate = (TextView) itemView.findViewById(R.id.txv_date_card);
            txvDescription = (TextView) itemView.findViewById(R.id.txv_description_card);
            btnShowCalendar = (Button) itemView.findViewById(R.id.btn_showCalendar_card);
        }
    }
}
