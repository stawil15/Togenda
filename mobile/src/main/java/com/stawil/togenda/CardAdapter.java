package com.stawil.togenda;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ContactViewHolder> {

    private List<EventCardInfo> eventList;

    public CardAdapter(List<EventCardInfo> contactList) {
        this.eventList = contactList;
    }


    @Override
    public int getItemCount() {
        return eventList.size();
    }

    @Override
    public void onBindViewHolder(ContactViewHolder contactViewHolder, int i) {
        EventCardInfo ci = eventList.get(i);
        contactViewHolder.name.setText(ci.name);
        contactViewHolder.description.setText(ci.description);
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.event_card_view, viewGroup, false);

        return new ContactViewHolder(itemView);
    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder {

        protected TextView name;
        protected TextView description;

        public ContactViewHolder(View v) {
            super(v);
            name =  (TextView) v.findViewById(R.id.TitleLabel);
            description = (TextView)  v.findViewById(R.id.description);
        }
    }
}