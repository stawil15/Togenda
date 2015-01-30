package com.stawil.togenda;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.EventViewHolder> {

    private List<GenericCard>eventList;

    public CardAdapter(List<GenericCard> CardList) {
        this.eventList = CardList;
    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }

    @Override
    public void onBindViewHolder(EventViewHolder eventViewHolder, int i) {
            EventCard ci = (EventCard) eventList.get(i);
            eventViewHolder.name.setText(ci.title);
            eventViewHolder.description.setText(ci.description);
            View cv = eventViewHolder.itemView.findViewById(R.id.cardBack);//card linearlayout
            cv.setBackgroundColor(ci.color);
    }



    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.event_card_view, viewGroup, false);

        return new EventViewHolder(itemView);
    }

    public static class EventViewHolder extends RecyclerView.ViewHolder {

        protected TextView name;
        protected TextView description;

        public EventViewHolder(View v) {
            super(v);
            name =  (TextView) v.findViewById(R.id.TitleLabel);
            description = (TextView)  v.findViewById(R.id.description);
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTextView;
        public ViewHolder(TextView v) {
            super(v);
            mTextView = v;
        }
    }


}