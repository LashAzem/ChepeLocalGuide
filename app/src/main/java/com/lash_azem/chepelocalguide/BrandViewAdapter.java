package com.lash_azem.chepelocalguide;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lash_azem.chepelocalguide.BrandFragment.OnListFragmentInteractionListener;
import com.lash_azem.chepelocalguide.dummy.DummyContent;
import com.lash_azem.chepelocalguide.dummy.DummyContent.DummyItem;

import java.util.List;

public class BrandViewAdapter extends RecyclerView.Adapter<BrandViewAdapter.ViewHolder> {

    List<DummyItem> mValues;
    OnListFragmentInteractionListener mListener;

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public BrandViewAdapter(List<DummyItem> items, OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_brand, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        //holder.mIdView.setText(mValues.get(position).id);
        holder.mContentView.setText(mValues.get(position).name);
        //holder.mDetailView.setText(mValues.get(position).details);
        holder.mCover.setImageResource(mValues.get(position).cover);

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
                Context context = v.getContext();
                Intent intent = new Intent(context, LocalDetailActivity.class);
                intent.putExtra(LocalDetailFragment.ARG_ITEM_ID, holder.mItem.id);

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        //public final TextView mIdView;
        public final TextView mContentView;
        public ImageView mCover;
        //public final TextView mDetailView;
        public DummyItem mItem;
        public final CardView cv;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            cv = (CardView)view.findViewById(R.id.cv);
            //mIdView = (TextView) view.findViewById(R.id.id);
            mContentView = (TextView) view.findViewById(R.id.content);
            mCover = (ImageView) view.findViewById(R.id.cover);
            //mDetailView = (TextView) view.findViewById(R.id.details);
        }

    }
}
