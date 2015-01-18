package com.stawil.togenda;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.EventViewHolder> {

    private List<EventCardInfo> eventList;

    public CardAdapter(List<EventCardInfo> contactList) {
        this.eventList = contactList;
    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }

    @Override
    public void onBindViewHolder(EventViewHolder eventViewHolder, int i) {

        EventCardInfo ci = eventList.get(i);
        eventViewHolder.name.setText(ci.name);
        eventViewHolder.description.setText(ci.description);
        View cv = eventViewHolder.itemView.findViewById(R.id.cardBack);
        //cv.setBackgroundColor(Color.RED);

        //Color color = cv.getBackground();
        //cc.setBackgroundColor();


        //eventViewHolder.
        //rl = (RelativeLayout) this.findViewById(R.id.rellay);

//        if ( == eventList.size() - 1 && mCurrentPage <= mTotalPageCount) {
////            if (mCurrentPage == mTotalPageCount) {
////                mLoadImagesListener.noMorePages();
////            } else {
////                int newPage = mCurrentPage + 1;
////                mLoadImagesListener.loadPage(newPage);
////            }
//        }

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